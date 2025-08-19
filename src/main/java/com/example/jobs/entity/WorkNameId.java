package com.example.jobs.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class WorkNameId implements Serializable {
    private String id;
    private String systemCode;
}
