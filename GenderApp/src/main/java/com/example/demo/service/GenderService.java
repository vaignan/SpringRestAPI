package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.GenderRepository;
import com.example.demo.entity.Gender;

@Service
public class GenderService {
	
	@Autowired
    GenderRepository genderRepository;
	
	 public Gender getGenderById(int id) {
	        return genderRepository.findById(id).get();
	    }

}
