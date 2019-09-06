package com.example.forms.services;

import java.util.List;
import com.example.forms.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class StudentDAO {
@Autowired
Jtemlete jtemplate ;

	public StudentDAO(Jtemlete jtemplate) {
	super();
	this.jtemplate = jtemplate;
}

	public StudentDAO() {
		super();
	}

	public Jtemlete getJtemplate() {
	return jtemplate;
}

public void setJtemplate(Jtemlete jtemplate) {
	this.jtemplate = jtemplate;
}

	public void createStudent(Student student) {
		String query = "insert into student (First_Name,Last_Name,Country,Lang) values(?,?,?,?)";
		Object obj[]= {student.getFirstName(),student.getLastName(),student.getCountry(),student.getLanguage()};
		jtemplate.update(query,obj);
		System.out.println("Inserted..!");
		
	}

	public  List<Student> getStudent() {
		String query="select * from student";
		return jtemplate.query(query ,new StudentMapper());
				
	}


}
