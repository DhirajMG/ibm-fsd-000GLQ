package com.example.forms;
import com.example.forms.services.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.forms.model.Student;

@Controller("/student")
//@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentDAO dao; 
	@GetMapping("/showForm")
	public String viewPage(Model theModel) {
		Student student = new Student();
		theModel.addAttribute("student",student);
		return "student_form";
	}
	
	@PostMapping("/processForm")
	public String processPage(@ModelAttribute("student") Student theStudent, Model theModel) {
		dao.createStudent(theStudent);
		theModel.addAttribute("tempStudent",theStudent);
		return "student_detail";
	}

}
