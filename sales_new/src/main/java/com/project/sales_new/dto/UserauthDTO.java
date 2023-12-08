package com.project.sales_new.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserauthDTO {
    @NotBlank(message = "Username is required")
    private String username;

    @NotBlank(message = "Password is required")
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // Getters and setters for the fields
}