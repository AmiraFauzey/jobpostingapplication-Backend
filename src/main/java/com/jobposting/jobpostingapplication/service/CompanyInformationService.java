package com.jobposting.jobpostingapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobposting.jobpostingapplication.exceptionhandler.ResourceNotFoundException;
import com.jobposting.jobpostingapplication.model.CompanyInformation;
import com.jobposting.jobpostingapplication.repository.CompanyInformationRepository;

@Service
public class CompanyInformationService {

	@Autowired
	CompanyInformationRepository companyInformationDao;

	public CompanyInformation findBycompanyId(Integer companyId) {
		return companyInformationDao.findBycompanyId(companyId);
	}

	public CompanyInformation createCompanyInfo(CompanyInformation companyInfo) {
		return companyInformationDao.save(companyInfo);
	}

	public CompanyInformation updateCompanyInfo(CompanyInformation companyInfo) {

		if (findBycompanyId(companyInfo.getCompanyId()) != null) {
			companyInformationDao.save(companyInfo);
			return findBycompanyId(companyInfo.getCompanyId());
		} else {
			throw new ResourceNotFoundException("Not found experience with id = " + companyInfo.getCompanyId());
		}
	}

	public Integer deleteCompanyInfo(Integer companyId) {
		if (findBycompanyId(companyId) == null) {
			throw new ResourceNotFoundException("Not found experience with id = " + companyId);
		}
		companyInformationDao.deleteById(companyId);
		return companyId;
	}

	public List<CompanyInformation> getAllCompanyInfo() {
		// TODO Auto-generated method stub
		return companyInformationDao.getAllCompanyInfo();
	}

}
