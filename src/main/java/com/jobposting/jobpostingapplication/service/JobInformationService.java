package com.jobposting.jobpostingapplication.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jobposting.jobpostingapplication.exceptionhandler.ResourceNotFoundException;
import com.jobposting.jobpostingapplication.model.JobInformation;
import com.jobposting.jobpostingapplication.repository.JobInformationRepository;

@Service
public class JobInformationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(JobInformationService.class);
	
	@Autowired
	JobInformationRepository jobInformationDao;

	public JobInformation findByJobId(Integer jobId) {
		JobInformation result =  jobInformationDao.findByJobId(jobId);
		LOGGER.error("Before Check Job Id");
		LOGGER.error("Result: {}", result);
		if(result == null) {
			LOGGER.error("After Check Job Id");
			throw new ResourceNotFoundException("Not found job with id = " + jobId);
		}
		return jobInformationDao.findByJobId(jobId);
	}

	public JobInformation createJob(JobInformation jobInformation) {

		return jobInformationDao.save(jobInformation);
	}

	public JobInformation updateJob(JobInformation jobInformation) {
		if (findByJobId(jobInformation.getJobId()) != null) {
			jobInformationDao.save(jobInformation);
			return findByJobId(jobInformation.getJobId());
		} else {
			throw new ResourceNotFoundException("Not found job with id = " + jobInformation.getJobId());
		}
	}
 
	public Integer deleteJob(Integer jobId) {
		if (findByJobId(jobId) == null) {
			throw new ResourceNotFoundException("Not found job with id = " + jobId);
		}
		jobInformationDao.deleteById(jobId);
		return jobId;
	}

	public List<JobInformation> getAllJobInfo() {
		// TODO Auto-generated method stub
		return jobInformationDao.getAllJobs();
	}

	
	public List<JobInformation> findAll(Integer pageSize, Integer pageNumber) {
		Pageable firstPageWithTwoElements = PageRequest.of(pageNumber, pageSize);
		Page<JobInformation> allProducts = jobInformationDao.findAll(firstPageWithTwoElements);
		LOGGER.error("{}", allProducts.toList());
		return allProducts.toList();
	}
}
