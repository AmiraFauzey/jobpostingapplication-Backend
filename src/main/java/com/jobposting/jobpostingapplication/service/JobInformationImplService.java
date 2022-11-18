package com.jobposting.jobpostingapplication.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jobposting.jobpostingapplication.model.JobInformation;
import com.jobposting.jobpostingapplication.repository.JobInformationRepository;

@Service
public class JobInformationImplService implements JobInformationSearchService{
    
    @Autowired
    JobInformationRepository jobinfoRepo;

    @Override
    public Page<JobInformation> getJobByJobTitleAndJobLocation(String jobTitle, String jobLocation,
	int page,int pageSize){

		Pageable sortedByPriceDescNameAsc = PageRequest.of(page, pageSize);
		Page<JobInformation> result = jobinfoRepo.findAllByJobTitleAndJobLocation(jobTitle, jobLocation, sortedByPriceDescNameAsc);
		return result;
	}
}
