package com.jobposting.jobpostingapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobposting.jobpostingapplication.model.SupplementalPayTypes;
import com.jobposting.jobpostingapplication.repository.JobSupplementaryPayTypeRepository;

@Service
public class JobSupplementalTypeService {

    @Autowired
    JobSupplementaryPayTypeRepository jobSuppTypeRepository;

    public List<SupplementalPayTypes> getAllSupPayType() {
        return jobSuppTypeRepository.getAllSupPayType();
    }
}
