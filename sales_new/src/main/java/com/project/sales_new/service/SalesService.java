package com.project.sales_new.service;

import com.project.sales_new.entity.Sales;
import com.project.sales_new.repository.SalesRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesService {
    @Autowired
    private SalesRepository SRepository;

    public List<Sales> findSalesData(Integer owner_id, String product_id) {
        return SRepository.customFetchNew(owner_id, product_id);
    }

}