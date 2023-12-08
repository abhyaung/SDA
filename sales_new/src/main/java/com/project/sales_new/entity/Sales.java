package com.project.sales_new.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sales")
public class Sales {

    @Id
    @GeneratedValue
    public int sales_id;
    public int product_id;
    public int owner_id;
    public int timeperiod_id;
    public int city_id;
    public int store_id;
    public String profit_loss;
    public String percent;
}