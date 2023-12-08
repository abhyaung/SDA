package com.project.sales_new.repository;

import com.project.sales_new.entity.Product;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "SELECT p FROM Product p")
    public List<Product> findallProducts();

    @Query(value = "SELECT p FROM Product p WHERE p.owner_id=:owner_id")
    public List<Product> customFetch(@Param("owner_id") Integer ownerID);
}