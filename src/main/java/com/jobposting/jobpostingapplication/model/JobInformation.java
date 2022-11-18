package com.jobposting.jobpostingapplication.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="job_information")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JobInformation {

	@Id
	@Column(name="job_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer jobId;
	
	@Column(name="job_country")
	private String jobCountry;
	
	@Column(name="job_language")
	private String jobLanguage;
	
	@Column(name="job_title")
	private String jobTitle;
	
	@Column(name="job_location")
	private String jobLocation;
	
	@Column(name="job_description")
	private String jobDescription;
	
	@Column(name="no_of_candidate_to_hire")
	private String noOfCandidateToHire;
	
	@Column(name="job_duration")
	private String jobDuration;
	
	@Column(name="minimum_salary")
	private String minimumSalary;
	
	@Column(name="maximum_salary")
	private String maximumSalary;
	
	@Column(name="job_rate")
	private String jobRate;
	
	@Column(name="pay_by")
	private String payBy;

	@Column(name="amount")
	private String amount;
	
	@OneToMany
	@JoinTable(name="supplemental_pay", joinColumns = @JoinColumn(name="job_id"),
	inverseJoinColumns = @JoinColumn(name="supplemental_pay_type_id"))
	private List<SupplementalPayTypes> supplementalPayTypes;
	
	@OneToMany
	@JoinTable(name="job_type", joinColumns = @JoinColumn(name="job_id"),
	inverseJoinColumns = @JoinColumn(name="job_type_id"))
	private List<JobTypes> jobTypes;
	
	@OneToMany
	@JoinTable(name="job_schedule", joinColumns = @JoinColumn(name="job_id"),
	inverseJoinColumns = @JoinColumn(name="job_schedule_type_id"))
	private List<JobScheduleTypes> jobScheduleTypes;
	
	@OneToMany
	@JoinTable(name="job_benefit", joinColumns = @JoinColumn(name="job_id"),
	inverseJoinColumns = @JoinColumn(name="job_benefit_type_id"))
	private List<JobBenefitTypes> jobBenefitPayTypes;

	@Column(name="company_id")
	private Integer companyId;
	
	
	
}
