package com.jobposting.jobpostingapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jobposting.jobpostingapplication.model.JobScheduleTypes;

@Repository
public interface JobScheduleRepository extends JpaRepository<JobScheduleTypes, Integer> {

    @Query("Select u from JobScheduleTypes u")
    public List<JobScheduleTypes> getAllJobSchedule();
}
