package com.jobposting.jobpostingapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jobposting.jobpostingapplication.model.JobInformation;

@Repository
public interface JobInformationRepository extends JpaRepository<JobInformation, Integer>{
	
	@Query("select u from JobInformation u where u.jobId = :jobId")
	public JobInformation findByJobId(@Param("jobId") Integer jobId);

	@Query("select u from JobInformation u")
	public List<JobInformation> getAllJobs();
	
}
