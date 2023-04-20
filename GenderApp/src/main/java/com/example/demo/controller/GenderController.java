package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Gender;
import com.example.demo.service.GenderService;

@RestController
public class GenderController {
	 @Autowired
	 GenderService genderService;

	@RequestMapping("/gender")
	public String getGender(String name) {
		
		return "Hi here is to get your gender";
	}
	
//	@GetMapping(value="/genderFromClient")
//	public List<Object> ClientGender() {
//		String uri = "https://api.genderize.io?name=mary";
//		RestTemplate rs = new RestTemplate();
//		Object[] genders = rs.getForObject(uri, Object[].class);
//		//System.out.print(genders);
//		return Arrays.asList(genders);
//	}
//	
	@GetMapping(value="/genderFromClient2")
	public String ClientGender2(String name) {
		String uri = "https://api.genderize.io?name="
				+name;
		RestTemplate rs = new RestTemplate();
		String OuserJson = rs.getForObject(uri, String.class);
		//System.out.print(genders);
		return OuserJson;
	}
	
	@GetMapping("/genders/{id}")
    private Gender getGenderById(@PathVariable("id") int id) {
        return genderService.getGenderById(id);
    }
}
