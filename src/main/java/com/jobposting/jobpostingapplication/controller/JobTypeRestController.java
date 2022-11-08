package com.jobposting.jobpostingapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobposting.jobpostingapplication.model.JobTypes;
import com.jobposting.jobpostingapplication.service.JobTypeService;

@RestController
@RequestMapping(value = "/JobType")
public class JobTypeRestController {

    @Autowired
    JobTypeService jobTypeService;

    @GetMapping(value = "/all")
    public ResponseEntity<List<JobTypes>> getAllData() {
        List<JobTypes> listOfJobTypes = jobTypeService.getAllJobTypes();
        if (listOfJobTypes.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(listOfJobTypes, HttpStatus.OK);
    }

}
