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
@Table(name="supplemental_pay_types")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SupplementalPayTypes {
	
	@Id
	@Column(name="supplemental_pay_type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer supplementalTypeId;
	
	@Column(name="supplemental_type")
	private String supplementalType;
	
}
