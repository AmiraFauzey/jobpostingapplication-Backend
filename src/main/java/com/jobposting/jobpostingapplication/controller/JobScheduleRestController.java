package com.jobposting.jobpostingapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobposting.jobpostingapplication.model.JobScheduleTypes;
import com.jobposting.jobpostingapplication.service.JobScheduleService;

@RestController
@RequestMapping(value = "/JobSchedule")
public class JobScheduleRestController {

    @Autowired
    JobScheduleService jobScheduleService;

    @GetMapping(value = "/all")
    public ResponseEntity<List<JobScheduleTypes>> getAllData() {
        List<JobScheduleTypes> listOfJobSchedules = jobScheduleService.getAllJobSchedule();
        if (listOfJobSchedules.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(listOfJobSchedules, HttpStatus.OK);
    }
}
