package com.jobposting.jobpostingapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jobposting.jobpostingapplication.model.JobBenefitTypes;

@Repository
public interface JobBenefitRepository extends JpaRepository<JobBenefitTypes, Integer> {

    @Query("select u from JobBenefitTypes u")
    public List<JobBenefitTypes> getAllJobBenefits();

}