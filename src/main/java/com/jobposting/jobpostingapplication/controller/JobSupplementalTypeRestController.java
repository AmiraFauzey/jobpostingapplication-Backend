package com.jobposting.jobpostingapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobposting.jobpostingapplication.model.SupplementalPayTypes;
import com.jobposting.jobpostingapplication.service.JobSupplementalTypeService;

@RestController
@RequestMapping(value = "/JobSupplementaryType")
public class JobSupplementalTypeRestController {

    @Autowired
    JobSupplementalTypeService jobSupplementalTypeService;

    @GetMapping(value = "/all")
    public ResponseEntity<List<SupplementalPayTypes>> getAllData() {
        List<SupplementalPayTypes> listOfSuppType = jobSupplementalTypeService.getAllSupPayType();
        if (listOfSuppType.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(listOfSuppType, HttpStatus.OK);
    }

}
