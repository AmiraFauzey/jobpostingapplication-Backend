package com.jobposting.jobpostingapplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="job_schedule_types")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JobScheduleTypes {
	
	@Id
	@Column(name="job_schedule_type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer jobScheduleTypeId;
	
	@Column(name="job_schedule_type")
	private String jobScheduleType;
}
