package com.project.sales_new.service;

import com.project.sales_new.entity.Product;
import com.project.sales_new.repository.ProductRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository PRepository;

    public List<Product> findallProductsnew() {
        return PRepository.findallProducts();
    }

    public List<Product> findByCustomQueryNew(Integer owner_id) {
        return PRepository.customFetch(owner_id);
    }
}