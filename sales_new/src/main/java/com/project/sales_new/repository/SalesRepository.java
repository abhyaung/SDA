package com.project.sales_new.repository;

import com.project.sales_new.entity.Sales;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SalesRepository extends JpaRepository<Sales, Integer> {

    @Query(value = "SELECT s FROM Sales s")
    public List<Sales> findallSales();

    @Query(value = "SELECT s FROM Sales s WHERE s.owner_id=:owner_id AND s.product_id=:product_id")
    public List<Sales> customFetchNew(@Param("owner_id") Integer ownerID, @Param("product_id") String productID);
}