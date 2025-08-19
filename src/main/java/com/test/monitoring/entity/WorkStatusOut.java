package com.test.monitoring.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CCC_WORK_STATUS_OUT", schema = "CSR")
public class WorkStatusOut {

    @Id
    @Column(name = "WST_IDEN")
    private Long id;

    @Column(name = "WST_WORK_IDEN")
    private String workId;

    @Column(name = "WST_FILE_IDEN", nullable = false)
    private String fileId;

    @Column(name = "WST_STAT_CODE", nullable = false)
    private Long statusCode;

    @Column(name = "WST_CREA_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @Column(name = "WST_BEGI_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date beginDate;

    @Column(name = "WST_ENDX_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    @Column(name = "WST_ERRO_TEXT")
    private String errorText;

    public WorkStatusOut() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getWorkId() { return workId; }
    public void setWorkId(String workId) { this.workId = workId; }
    public String getFileId() { return fileId; }
    public void setFileId(String fileId) { this.fileId = fileId; }
    public Long getStatusCode() { return statusCode; }
    public void setStatusCode(Long statusCode) { this.statusCode = statusCode; }
    public Date getCreationDate() { return creationDate; }
    public void setCreationDate(Date creationDate) { this.creationDate = creationDate; }
    public Date getBeginDate() { return beginDate; }
    public void setBeginDate(Date beginDate) { this.beginDate = beginDate; }
    public Date getEndDate() { return endDate; }
    public void setEndDate(Date endDate) { this.endDate = endDate; }
    public String getErrorText() { return errorText; }
    public void setErrorText(String errorText) { this.errorText = errorText; }
}
