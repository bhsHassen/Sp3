package com.example.jobs.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "CCC_WORK_STATUS_OUT", schema = "CSR")
@Data
public class WorkStatusOut {
    @Id
    @Column(name = "WST_IDEN")
    private Long id;

    @Column(name = "WST_WORK_IDEN")
    private String workId;

    @Column(name = "WST_FILE_IDEN")
    private String fileId;

    @Column(name = "WST_STAT_CODE")
    private Long statusCode;

    @Column(name = "WST_CREA_DATE")
    private Date creationDate;

    @Column(name = "WST_BEGI_DATE")
    private Date beginDate;

    @Column(name = "WST_ENDX_DATE")
    private Date endDate;

    @Column(name = "WST_ERRO_TEXT")
    private String errorText;
}
