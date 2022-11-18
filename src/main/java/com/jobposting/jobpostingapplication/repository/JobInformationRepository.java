package com.jobposting.jobpostingapplication.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

	// @Query("SELECT p FROM  JobInformation p WHERE" + 
	//        "p.jobTitle LIKE CONCAT('%',:query, '%')" + 
	// 	   "p.jobLocation LIKE CONCAT('%',:query, '%')")
	// List<JobInformation> searchJobInformations(String query);
	Page<JobInformation> findAllByJobTitleAndJobLocation(@Param("jobTitle")String jobTitle, @Param("jobLocation")String jobLocation, Pageable pageable);
}
