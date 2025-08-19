package com.example.jobs.repository;

import com.example.jobs.entity.SystemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemRepository extends JpaRepository<SystemEntity, String> {}
