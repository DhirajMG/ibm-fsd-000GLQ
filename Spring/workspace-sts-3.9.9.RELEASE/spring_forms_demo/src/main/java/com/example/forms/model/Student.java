package com.example.forms.model;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class Student {
	private int id;
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

private String firstName;
private String lastName;
private String country;
private String language;
private LinkedHashMap<String,String> countryOptions;
public String[] operatingSystems;
@Override
public String toString() {
	return "Student [operatingSystems=" + Arrays.toString(operatingSystems) + "]";
}
public String[] getOperatingSystems() {
	return operatingSystems;
}
public void setOperatingSystems(String[] operatingSystems) {
	this.operatingSystems = operatingSystems;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}


public Student() {
	countryOptions = new LinkedHashMap<String, String>();
	countryOptions.put("BR", "Brazil");
	countryOptions.put("FR", "France");
	countryOptions.put("DE", "Germany");
	countryOptions.put("IN", "India");
	countryOptions.put("US", "United States of America");
}
public Student(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public LinkedHashMap<String, String> getCountryOptions() {
	return countryOptions;
}


}
