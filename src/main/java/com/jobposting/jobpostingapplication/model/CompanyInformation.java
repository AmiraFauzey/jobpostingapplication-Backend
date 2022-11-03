package com.jobposting.jobpostingapplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="company_information")
@Data
public class CompanyInformation {
	
	@Id
	@Column(name="company_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer companyId;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="company_size")
	private String companySize;
	
	@Column(name="employer_name")
	private String employerName;
	
	@Column(name="company_phone_number")
	private String companyPhoneNumber;
	
	@Column(name="company_location")
	private String companyLocation;
}