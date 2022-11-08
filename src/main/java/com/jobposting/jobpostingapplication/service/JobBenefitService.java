package com.jobposting.jobpostingapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobposting.jobpostingapplication.model.JobBenefitTypes;
import com.jobposting.jobpostingapplication.repository.JobBenefitRepository;

@Service
public class JobBenefitService {

    @Autowired
    JobBenefitRepository jobBenefitRepository;

    public List<JobBenefitTypes> getAllJobBenefits() {
        return jobBenefitRepository.getAllJobBenefits();
    }
}
