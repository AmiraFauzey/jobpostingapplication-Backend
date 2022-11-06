package com.jobposting.jobpostingapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jobposting.jobpostingapplication.model.JobInformation;
import com.jobposting.jobpostingapplication.service.JobInformationService;

@CrossOrigin
@RestController
@RequestMapping(value = "/jobInformation")
public class JobInformationRestController {

	@Autowired
	JobInformationService jobInformationService;

	// insert job into database

	@PutMapping(value = "/job")
	public ResponseEntity<JobInformation> createJob(@RequestBody JobInformation jobInformation) {

		JobInformation saveJob = jobInformationService.createJob(jobInformation);
		return new ResponseEntity<>(saveJob, HttpStatus.CREATED);
	}

	@GetMapping(value = ("/job/template"))
	public ResponseEntity<JobInformation> getTemplate() {
		return new ResponseEntity<>(new JobInformation(), HttpStatus.OK);
	}

	// update job
	@PostMapping(value = "/job/{jobId}")
	public ResponseEntity<JobInformation> updateJob(@PathVariable Integer jobId,
			@RequestBody JobInformation jobInformation) {
		jobInformation.setJobId(jobId);
		JobInformation jobInfo = jobInformationService.updateJob(jobInformation);

		return new ResponseEntity<>(jobInfo, HttpStatus.OK);
	}

	// Delete job
	@DeleteMapping(value = "/job/{jobId}")
	public ResponseEntity<Integer> deleteJob(@PathVariable Integer jobId) {
		Integer deleteJob = jobInformationService.deleteJob(jobId);
		return new ResponseEntity<>(deleteJob, HttpStatus.OK);
	}

	// Get all data
	@GetMapping(value = "/job")
	public ResponseEntity<List<JobInformation>> getAlldata() {
		List<JobInformation> listOfJobs = jobInformationService.getAllJobInfo();
		if (listOfJobs.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(listOfJobs, HttpStatus.OK);
	}

	// Get data by jobId
	@GetMapping(value = "/job/{jobId}")
	public ResponseEntity<JobInformation> getJobById(@PathVariable Integer jobId) {
		JobInformation result = jobInformationService.findByJobId(jobId);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	// Get filter data result

	@PostMapping(value = "/job")
	public ResponseEntity<List<JobInformation>> getJobs(@RequestParam("pageSize") Integer pageSize,
			@RequestParam("pageNumber") Integer pageNumber) {
		List<JobInformation> result = jobInformationService.findAll(pageSize, pageNumber);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}
