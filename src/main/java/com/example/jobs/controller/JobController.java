package com.example.jobs.controller;

import com.example.jobs.dto.JobExecutionDTO;
import com.example.jobs.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/jobs")
@RequiredArgsConstructor
public class JobController {
    private final JobService jobService;

    @GetMapping
    public List<JobExecutionDTO> getJobs() {
        return jobService.getAllJobs();
    }
}
