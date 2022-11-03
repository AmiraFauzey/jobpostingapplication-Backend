package com.jobposting.jobpostingapplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="supplemental_pay_types")
@Data
public class SupplementalPayTypes {
	
	@Id
	@Column(name="supplemental_pay_type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer supplementalTypeId;
	
	@Column(name="supplemental_type")
	private String supplementalType;
	
}
