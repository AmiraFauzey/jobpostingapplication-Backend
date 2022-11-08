package com.jobposting.jobpostingapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jobposting.jobpostingapplication.model.JobTypes;

@Repository
public interface JobTypeRepository extends JpaRepository<JobTypes, Integer> {

    @Query("Select u from JobTypes u")
    public List<JobTypes> getAllJobTypes();
}
