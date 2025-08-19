package com.test.monitoring.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CCC_WORK_NAME", schema = "CSR")
@IdClass(WorkNameId.class)
public class WorkName {

    @Id
    @Column(name = "WN_ID")
    private String id;

    @Id
    @Column(name = "WN_SYSTEM_CODE")
    private String systemCode;

    @Column(name = "WN_TYPE", nullable = false)
    private String type;

    public WorkName() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getSystemCode() { return systemCode; }
    public void setSystemCode(String systemCode) { this.systemCode = systemCode; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}
