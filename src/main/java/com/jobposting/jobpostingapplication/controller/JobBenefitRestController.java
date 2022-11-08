package com.jobposting.jobpostingapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobposting.jobpostingapplication.model.JobBenefitTypes;
import com.jobposting.jobpostingapplication.service.JobBenefitService;

@CrossOrigin
@RestController
@RequestMapping(value = "/JobBenefit")
public class JobBenefitRestController {

    @Autowired
    JobBenefitService jobBenefitService;

    // Get all data
    @GetMapping(value = "/all")
    public ResponseEntity<List<JobBenefitTypes>> getAlldata() {
        List<JobBenefitTypes> listOfBenefits = jobBenefitService.getAllJobBenefits();
        if (listOfBenefits.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(listOfBenefits, HttpStatus.OK);
    }
}
