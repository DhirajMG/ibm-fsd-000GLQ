package com.example.forms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String goHome()
 {
	 return "main_menu";
 }
	
	
}
