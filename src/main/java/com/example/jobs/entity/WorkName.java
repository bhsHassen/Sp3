package com.example.jobs.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "CCC_WORK_NAME", schema = "CSR")
@Data
@IdClass(WorkNameId.class)
public class WorkName {
    @Id
    @Column(name = "WN_ID")
    private String id;

    @Id
    @Column(name = "WN_SYSTEM_CODE")
    private String systemCode;

    @Column(name = "WN_TYPE")
    private String type;
}
