package com.example.forms.services;

import javax.annotation.PostConstruct;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.stereotype.Component;


@Component
public class DataSource extends BasicDataSource{

@PostConstruct
public void DataSourceCreate() {
	
	setUrl("jdbc:mysql://localhost:3306/mydb");
	setUsername("root");
	setPassword("135246");
	setDriverClassName("com.mysql.jdbc.Driver");

System.out.println(getUrl());
}

public DataSource() {
	super();
}

}