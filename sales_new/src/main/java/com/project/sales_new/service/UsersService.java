package com.project.sales_new.service;

import com.project.sales_new.entity.Users;
import com.project.sales_new.repository.UsersRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired
    private UsersRepository URepository;

    public List<Users> findallUsersnew() {
        return URepository.findallusers();
    }

    public Users findByCustomQueryNew(String email) {
        return URepository.customFetchEmail(email);
    }
}