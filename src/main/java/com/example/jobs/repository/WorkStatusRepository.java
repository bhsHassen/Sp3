package com.example.jobs.repository;

import com.example.jobs.entity.WorkStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkStatusRepository extends JpaRepository<WorkStatus, Long> {}
