package com.test.monitoring.controller;

import com.test.monitoring.dto.JobExecutionDTO;
import com.test.monitoring.service.JobService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping
    public List<JobExecutionDTO> getJobsLatest() {
        return jobService.getAllJobsLatestOnly();
    }
}
