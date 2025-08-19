package com.test.monitoring.repository;

import com.test.monitoring.entity.WorkName;
import com.test.monitoring.entity.WorkNameId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkNameRepository extends JpaRepository<WorkName, WorkNameId> {}
