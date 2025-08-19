package com.test.monitoring.repository;

import com.test.monitoring.entity.WorkName;
import com.test.monitoring.entity.WorkNameId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface JobRepository extends JpaRepository<WorkName, WorkNameId> {

    @Query(value = """
        WITH IN_STAT AS (
            SELECT 'IN' AS job_type,
                   ws.wsi_work_iden AS work_id,
                   ws.wsi_file_iden AS file_id,
                   ws.wsi_stat_code AS status_code,
                   ws.wsi_begi_date AS begin_date,
                   ws.wsi_endx_date AS end_date,
                   ws.wsi_erro_text AS error_text,
                   ROW_NUMBER() OVER (
                       PARTITION BY ws.wsi_work_iden
                       ORDER BY NVL(ws.wsi_endx_date, NVL(ws.wsi_begi_date, ws.wsi_crea_date)) DESC NULLS LAST
                   ) AS rn
            FROM CSR.CCC_WORK_STATUS ws
        ),
        OUT_STAT AS (
            SELECT 'OUT' AS job_type,
                   wso.wst_work_iden AS work_id,
                   wso.wst_file_iden AS file_id,
                   wso.wst_stat_code AS status_code,
                   wso.wst_begi_date AS begin_date,
                   wso.wst_endx_date AS end_date,
                   wso.wst_erro_text AS error_text,
                   ROW_NUMBER() OVER (
                       PARTITION BY wso.wst_work_iden
                       ORDER BY NVL(wso.wst_endx_date, NVL(wso.wst_begi_date, wso.wst_crea_date)) DESC NULLS LAST
                   ) AS rn
            FROM CSR.CCC_WORK_STATUS_OUT wso
        ),
        STATUSES AS (
            SELECT * FROM IN_STAT  WHERE rn = 1
            UNION ALL
            SELECT * FROM OUT_STAT WHERE rn = 1
        )
        SELECT st.job_type       AS jobType,
               st.work_id        AS workId,
               st.file_id        AS fileId,
               wn.wn_system_code AS systemCode,
               wn.wn_type        AS workType,
               st.status_code    AS statusCode,
               st.begin_date     AS beginDate,
               st.end_date       AS endDate,
               st.error_text     AS errorText
        FROM STATUSES st
        LEFT JOIN CSR.CCC_WORK_NAME wn ON wn.WN_ID = st.work_id
        LEFT JOIN CSR.CCC_SYSTEMS s    ON s.CODE = wn.WN_SYSTEM_CODE
        """, nativeQuery = true)
    List<JobRow> getLatestJobExecutions();
}
