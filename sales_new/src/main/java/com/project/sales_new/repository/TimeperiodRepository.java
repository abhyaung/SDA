package com.project.sales_new.repository;

import com.project.sales_new.entity.Timeperiod;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TimeperiodRepository extends JpaRepository<Timeperiod, Integer> {

    @Query(value = "SELECT t FROM Timeperiod t ORDER BY t.displayflag ASC")
    public List<Timeperiod> findallTP();
}