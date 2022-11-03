package com.jobposting.jobpostingapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jobposting.jobpostingapplication.model.CompanyInformation;

@Repository
public interface CompanyInformationRepository extends JpaRepository<CompanyInformation, Integer>{
	
	@Query("select u from CompanyInformation u where u.companyId = :companyId")
	public CompanyInformation findBycompanyId(@Param("companyId") Integer companyId);
	
	@Query("select u from CompanyInformation u")
	public List<CompanyInformation> getAllCompanyInfo();
}
