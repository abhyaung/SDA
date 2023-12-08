package com.project.sales_new.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CityDTO {
    @NotBlank(message = "city_id is required")
    private String cityid;

    private String name;

    public String getCityId() {
        return cityid;
    }

    public String getname() {
        return name;
    }
    // Getters and setters for the fields
}