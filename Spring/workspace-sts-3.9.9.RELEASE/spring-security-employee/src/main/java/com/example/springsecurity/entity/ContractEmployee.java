package com.example.springsecurity.entity;

import javax.persistence.Entity;

@Entity
public class ContractEmployee extends Employee {
	
	private String hourlyRate;
	private String duration;
	public ContractEmployee() {
		super();
	}
	
	public ContractEmployee(String hourlyRate, String duration) {
		super();
		this.hourlyRate = hourlyRate;
		this.duration = duration;
	}
	
	
	public ContractEmployee(String firstName, String lastName, String email) {
		super(firstName, lastName, email);
	}
	
	public ContractEmployee(String firstName, String lastName, String email,String hourlyRate, String duration) {
		super(firstName, lastName, email);
		this.hourlyRate = hourlyRate;
		this.duration = duration;
	}

	public String getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(String hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
}