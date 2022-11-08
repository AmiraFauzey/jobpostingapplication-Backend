package com.jobposting.jobpostingapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobposting.jobpostingapplication.model.JobScheduleTypes;
import com.jobposting.jobpostingapplication.repository.JobScheduleRepository;

@Service
public class JobScheduleService {

    @Autowired
    JobScheduleRepository jobScheduleRepository;

    public List<JobScheduleTypes> getAllJobSchedule() {
        return jobScheduleRepository.getAllJobSchedule();
    }
}
