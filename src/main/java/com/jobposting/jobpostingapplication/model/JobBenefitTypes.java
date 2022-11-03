package com.jobposting.jobpostingapplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="job_benefit_types")
@Data
public class JobBenefitTypes {
	
	@Id
	@Column(name="job_benefit_type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer jobBenefitTypeId;
	
	@Column(name="job_benefit_type")
	private String jobBenefitType;
}
