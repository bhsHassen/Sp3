package com.example.jobs.service;

import com.example.jobs.dto.JobExecutionDTO;
import com.example.jobs.entity.WorkStatus;
import com.example.jobs.entity.WorkStatusOut;
import com.example.jobs.entity.WorkName;
import com.example.jobs.repository.WorkStatusRepository;
import com.example.jobs.repository.WorkStatusOutRepository;
import com.example.jobs.repository.WorkNameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class JobService {
    private final WorkStatusRepository workStatusRepo;
    private final WorkStatusOutRepository workStatusOutRepo;
    private final WorkNameRepository workNameRepo;

    public List<JobExecutionDTO> getAllJobs() {
        List<JobExecutionDTO> result = new ArrayList<>();

        for (WorkStatus ws : workStatusRepo.findAll()) {
            WorkName wn = workNameRepo.findById(new com.example.jobs.entity.WorkNameId(ws.getWorkId(), ""))
                    .orElse(null);
            if (wn != null) {
                result.add(new JobExecutionDTO(
                        ws.getWorkId(),
                        wn.getSystemCode(),
                        "IN",
                        ws.getStatusCode(),
                        ws.getBeginDate(),
                        ws.getEndDate(),
                        ws.getErrorText()
                ));
            }
        }

        for (WorkStatusOut ws : workStatusOutRepo.findAll()) {
            WorkName wn = workNameRepo.findById(new com.example.jobs.entity.WorkNameId(ws.getWorkId(), ""))
                    .orElse(null);
            if (wn != null) {
                result.add(new JobExecutionDTO(
                        ws.getWorkId(),
                        wn.getSystemCode(),
                        "OUT",
                        ws.getStatusCode(),
                        ws.getBeginDate(),
                        ws.getEndDate(),
                        ws.getErrorText()
                ));
            }
        }
        return result;
    }
}
