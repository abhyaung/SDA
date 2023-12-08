package com.project.sales_new.service;

import com.project.sales_new.entity.Timeperiod;
import com.project.sales_new.repository.TimeperiodRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeperiodService {
    @Autowired
    private TimeperiodRepository TRepository;

    public List<Timeperiod> findallTPnew() {
        return TRepository.findallTP();
    }

}