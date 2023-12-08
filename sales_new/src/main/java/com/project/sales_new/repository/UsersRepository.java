package com.project.sales_new.repository;

import com.project.sales_new.entity.Users;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsersRepository extends JpaRepository<Users, Integer> {

    @Query(value = "SELECT u FROM Users u")
    public List<Users> findallusers();

    @Query(value = "SELECT u FROM Users u WHERE email=:email")
    public Users customFetchEmail(@Param("email") String emaill);
}