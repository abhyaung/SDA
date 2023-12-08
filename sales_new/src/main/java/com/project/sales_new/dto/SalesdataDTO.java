package com.project.sales_new.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SalesdataDTO {
    @NotBlank(message = "Username is required")
    private String username;

    @NotBlank(message = "Password is required")
    private String password;

    @Size(max = 255)
    private String productId;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getProductId() {
        return productId;
    }

    // Getters and setters for the fields
}