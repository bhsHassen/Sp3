package com.test.monitoring.repository;

import com.test.monitoring.entity.SystemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemRepository extends JpaRepository<SystemEntity, String> {}
