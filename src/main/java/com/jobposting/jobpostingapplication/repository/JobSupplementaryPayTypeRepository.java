package com.jobposting.jobpostingapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jobposting.jobpostingapplication.model.SupplementalPayTypes;

@Repository
public interface JobSupplementaryPayTypeRepository extends JpaRepository<SupplementalPayTypes, Integer> {

    @Query("Select u from SupplementalPayTypes u")
    public List<SupplementalPayTypes> getAllSupPayType();
}
