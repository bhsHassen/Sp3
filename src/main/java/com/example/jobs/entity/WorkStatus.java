package com.example.jobs.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "CCC_WORK_STATUS", schema = "CSR")
@Data
public class WorkStatus {
    @Id
    @Column(name = "WSI_IDEN")
    private Long id;

    @Column(name = "WSI_WORK_IDEN")
    private String workId;

    @Column(name = "WSI_FILE_IDEN")
    private String fileId;

    @Column(name = "WSI_STAT_CODE")
    private Long statusCode;

    @Column(name = "WSI_CREA_DATE")
    private Date creationDate;

    @Column(name = "WSI_BEGI_DATE")
    private Date beginDate;

    @Column(name = "WSI_ENDX_DATE")
    private Date endDate;

    @Column(name = "WSI_ERRO_TEXT")
    private String errorText;
}
