package com.project.sales_new.repository;

import com.project.sales_new.entity.City;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CityRepository extends JpaRepository<City, Integer> {

    @Query(value = "SELECT c FROM City c")
    public List<City> findbyCityId();

    @Query(value = "SELECT c FROM City c WHERE city_id=:cityID")
    public List<City> customFetch(@Param("cityID") String cityIDD);
}