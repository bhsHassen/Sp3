package com.example.jobs.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "CCC_SYSTEMS", schema = "CSR")
@Data
public class SystemEntity {
    @Id
    @Column(name = "CODE")
    private String code;

    @Column(name = "IRA_IDEN")
    private Long iraIden;

    @Column(name = "FLAG_SD_ACC_NAT")
    private String flag;
}
