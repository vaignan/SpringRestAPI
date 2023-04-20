package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Gender;

@Repository
public interface GenderRepository extends JpaRepository < Gender, Integer > {
    
}