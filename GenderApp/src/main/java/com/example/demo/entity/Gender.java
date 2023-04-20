package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="Gender")
@Entity
public class Gender {
	@Id
	Integer code;
	String name;
	String type;
	
	public String getName() {
		return this.name;
	}
	public String getType() {
		return this.type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTyoe(String type) {
		this.type = type;
	}
}
