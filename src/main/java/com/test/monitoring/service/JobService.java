package com.test.monitoring.service;

import com.test.monitoring.dto.JobExecutionDTO;
import com.test.monitoring.repository.JobRepository;
import com.test.monitoring.repository.JobRow;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {

    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<JobExecutionDTO> getAllJobsLatestOnly() {
        List<JobRow> rows = jobRepository.getLatestJobExecutions();
        List<JobExecutionDTO> out = new ArrayList<>(rows.size());
        for (JobRow r : rows) {
            out.add(new JobExecutionDTO(
                r.getJobType(),
                r.getWorkId(),
                r.getSystemCode(),
                r.getStatusCode(),
                r.getBeginDate(),
                r.getEndDate(),
                r.getErrorText(),
                r.getFileId()
            ));
        }
        return out;
    }
}
