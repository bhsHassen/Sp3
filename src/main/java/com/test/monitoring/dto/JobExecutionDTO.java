package com.test.monitoring.dto;

import java.util.Date;

public class JobExecutionDTO {
    private String jobType;   // IN / OUT
    private String workId;
    private String systemCode;
    private Long statusCode;
    private Date beginDate;
    private Date endDate;
    private String errorText;
    private String fileId;

    public JobExecutionDTO() {}

    public JobExecutionDTO(String jobType, String workId, String systemCode, Long statusCode,
                           Date beginDate, Date endDate, String errorText, String fileId) {
        this.jobType = jobType;
        this.workId = workId;
        this.systemCode = systemCode;
        this.statusCode = statusCode;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.errorText = errorText;
        this.fileId = fileId;
    }

    public String getJobType() { return jobType; }
    public void setJobType(String jobType) { this.jobType = jobType; }

    public String getWorkId() { return workId; }
    public void setWorkId(String workId) { this.workId = workId; }

    public String getSystemCode() { return systemCode; }
    public void setSystemCode(String systemCode) { this.systemCode = systemCode; }

    public Long getStatusCode() { return statusCode; }
    public void setStatusCode(Long statusCode) { this.statusCode = statusCode; }

    public Date getBeginDate() { return beginDate; }
    public void setBeginDate(Date beginDate) { this.beginDate = beginDate; }

    public Date getEndDate() { return endDate; }
    public void setEndDate(Date endDate) { this.endDate = endDate; }

    public String getErrorText() { return errorText; }
    public void setErrorText(String errorText) { this.errorText = errorText; }

    public String getFileId() { return fileId; }
    public void setFileId(String fileId) { this.fileId = fileId; }
}
