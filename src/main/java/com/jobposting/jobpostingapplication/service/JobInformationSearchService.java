package com.jobposting.jobpostingapplication.service;

import org.springframework.data.domain.Page;

import com.jobposting.jobpostingapplication.model.JobInformation;

public interface JobInformationSearchService {
    
    Page<JobInformation> getJobByJobTitleAndJobLocation(String jobTitle, String jobLocation,int page,int pageSize);
}
