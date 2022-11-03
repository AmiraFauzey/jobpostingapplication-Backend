package com.jobposting.jobpostingapplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="job_types")
@Data
public class JobTypes {
	
	@Id
	@Column(name="job_type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer jobTypeId;
	
	@Column(name="job_type")
	private String jobType;
	
}
