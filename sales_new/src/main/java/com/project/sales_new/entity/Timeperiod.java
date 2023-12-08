package com.project.sales_new.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "timeperiod")
public class Timeperiod {

    @Id
    @GeneratedValue
    public int timeperiod_id;
    public String timeperiod_name;
    public int displayflag;
    public int displayorder;
}