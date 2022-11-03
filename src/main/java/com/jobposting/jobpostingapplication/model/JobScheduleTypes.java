package com.jobposting.jobpostingapplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="job_schedule_types")
@Data
public class JobScheduleTypes {
	
	@Id
	@Column(name="job_schedule_type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer jobScheduleTypeId;
	
	@Column(name="job_schedule_type")
	private String jobScheduleType;
}
