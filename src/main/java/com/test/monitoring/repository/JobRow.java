package com.test.monitoring.repository;

import java.util.Date;

public interface JobRow {
    String getJobType();
    String getWorkId();
    String getFileId();
    String getSystemCode();
    String getWorkType();
    Long getStatusCode();
    Date getBeginDate();
    Date getEndDate();
    String getErrorText();
}
