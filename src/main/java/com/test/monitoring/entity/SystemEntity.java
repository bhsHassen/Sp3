package com.test.monitoring.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CCC_SYSTEMS", schema = "CSR")
public class SystemEntity {
    @Id
    @Column(name = "CODE")
    private String code;

    @Column(name = "IRA_IDEN", nullable = false)
    private Long iraIden;

    @Column(name = "FLAG_SD_ACC_NAT", nullable = false)
    private String flag;

    public SystemEntity() {}

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public Long getIraIden() { return iraIden; }
    public void setIraIden(Long iraIden) { this.iraIden = iraIden; }
    public String getFlag() { return flag; }
    public void setFlag(String flag) { this.flag = flag; }
}
