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
@Table(name="company_information")
@Builder
@NoArgsConstructor
@AllArgsConstructor
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

	@Column(name="company_language")
	private String companyLanguage;

	@Column(name="company_country")
	private String companyCountry;
}
