package org.springFramework.datasource_demo;

import javax.annotation.PostConstruct;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.stereotype.Component;
@Component
public class DataSource extends BasicDataSource {
	public DataSource() {
		
	}
	@PostConstruct
	public void data() {
		this.setUrl("jdbc:mysql://localhost:3306/mydb");
		this.setUsername("root");
		this.setPassword("135246"); 
		this.setDriverClassName("com.mysql.jdbc.Driver");
	}
	
}
