package com.jobposting.jobpostingapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jobposting.jobpostingapplication.model.CompanyInformation;
import com.jobposting.jobpostingapplication.service.CompanyInformationService;


@RestController
@RequestMapping(value="/companyInformation")
public class CompanyInformationRestController {

	@Autowired
	CompanyInformationService companyInfoSvc;

	// 1.create company information
	@PutMapping(value = "/company")
	public ResponseEntity<CompanyInformation> createCompanyInfo(@RequestBody CompanyInformation companyInformation)
			throws Exception {

		CompanyInformation saveCompanyInfo = companyInfoSvc.createCompanyInfo(companyInformation);
		return new ResponseEntity<>(saveCompanyInfo, HttpStatus.CREATED);
	}

	// 2.update company information
	@PostMapping(value = "/company/{companyId}")
	public ResponseEntity<CompanyInformation> updateCompanyInfo(@PathVariable Integer companyId, @RequestBody CompanyInformation companyInformation)
			throws Exception {
		companyInformation.setCompanyId(companyId);
		CompanyInformation updateCompanyInfo = companyInfoSvc.updateCompanyInfo(companyInformation);

		return new ResponseEntity<>(updateCompanyInfo, HttpStatus.OK);
	}

	// 3.view company information by companyId
	@GetMapping(value = "/company" + "/{companyId}")
	public ResponseEntity<CompanyInformation> getCompanyInfoById(@PathVariable Integer companyId) {
		CompanyInformation companyInfoById = companyInfoSvc.findBycompanyId(companyId);
		return new ResponseEntity<>(companyInfoById, HttpStatus.OK);
	}
	
	//View all company Information
	@GetMapping(value = "/company")
	public ResponseEntity<List<CompanyInformation>> getAlldata() {
		List<CompanyInformation> listOfCompanies = companyInfoSvc.getAllCompanyInfo();
		return new ResponseEntity<>(listOfCompanies, HttpStatus.OK);
	}

	// 4.delete Company Info
	@DeleteMapping(value = "/company/{companyId}")
	public ResponseEntity<Integer> deleteCompanyInfo(@PathVariable Integer companyId) {
		Integer deleteCompanyInfo = companyInfoSvc.deleteCompanyInfo(companyId);
		return new ResponseEntity<>(deleteCompanyInfo, HttpStatus.OK);
	}
}
