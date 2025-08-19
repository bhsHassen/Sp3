package com.test.monitoring.entity;

import java.io.Serializable;
import java.util.Objects;

public class WorkNameId implements Serializable {
    private String id;
    private String systemCode;

    public WorkNameId() {}

    public WorkNameId(String id, String systemCode) {
        this.id = id;
        this.systemCode = systemCode;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getSystemCode() { return systemCode; }
    public void setSystemCode(String systemCode) { this.systemCode = systemCode; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkNameId that = (WorkNameId) o;
        return java.util.Objects.equals(id, that.id) && java.util.Objects.equals(systemCode, that.systemCode);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, systemCode);
    }
}
