package com.example.springsecurity.entity;
import javax.persistence.Entity;

@Entity
public class PermanentEmployee extends Employee {
	private String salary;
	private String commission;

	public PermanentEmployee() {
		super();
	}
	
	public PermanentEmployee(String salary, String commission) {
		super();
		this.salary = salary;
		this.commission = commission;
	}

	public PermanentEmployee(String firstName, String lastName, String email) {
		super(firstName, lastName, email);
	}
	
	public PermanentEmployee(String firstName, String lastName, String email,String salary, String commission) {
		super(firstName, lastName, email);
		this.salary = salary;
		this.commission = commission;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getCommission() {
		return commission;
	}

	public void setCommission(String commission) {
		this.commission = commission;
	}
	
	
}