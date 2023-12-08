package com.project.sales_new.service;

import com.project.sales_new.entity.City;
import com.project.sales_new.repository.CityRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    private CityRepository CityNewrepository;

    public List<City> findByCityIdNew() {
        return CityNewrepository.findbyCityId();
    }

    public List<City> findByCustomQueryNew(String cityIDNew) {
        return CityNewrepository.customFetch(cityIDNew);
    }
}