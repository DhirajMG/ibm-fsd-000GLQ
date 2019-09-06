package com.example.forms.services;
import com.example.forms.model.Student;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student= new Student();
		student.setFirstName(rs.getString(2));
		student.setLastName(rs.getString(3));
		student.setCountry(rs.getString(4));
		student.setLanguage(rs.getString(5));
	return student;
	}
	

}


