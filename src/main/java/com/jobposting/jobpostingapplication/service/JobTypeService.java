package com.jobposting.jobpostingapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobposting.jobpostingapplication.model.JobTypes;
import com.jobposting.jobpostingapplication.repository.JobTypeRepository;

@Service
public class JobTypeService {

    @Autowired
    JobTypeRepository jobTypeRepository;

    public List<JobTypes> getAllJobTypes() {
        return jobTypeRepository.getAllJobTypes();
    }
}
