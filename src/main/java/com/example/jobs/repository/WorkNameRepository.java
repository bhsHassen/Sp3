package com.example.jobs.repository;

import com.example.jobs.entity.WorkName;
import com.example.jobs.entity.WorkNameId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkNameRepository extends JpaRepository<WorkName, WorkNameId> {}
