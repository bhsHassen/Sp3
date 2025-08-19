package com.test.monitoring.repository;

import com.test.monitoring.entity.WorkStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkStatusRepository extends JpaRepository<WorkStatus, Long> {}
