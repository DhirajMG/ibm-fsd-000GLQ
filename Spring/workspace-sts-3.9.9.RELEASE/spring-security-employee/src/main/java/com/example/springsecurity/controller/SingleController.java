package com.example.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springsecurity.repository.ContractEmployeeRepository;
import com.example.springsecurity.repository.EmployeeRepository;
import com.example.springsecurity.repository.PermanentEmployeeRepository;;

@Controller
@RequestMapping("/")
public class SingleController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private ContractEmployeeRepository contractEmployeeRepository;
	@Autowired
	private PermanentEmployeeRepository permanentEmployeeRepository;
	
	@GetMapping("/")
	public String showHome(Model model) {
		model.addAttribute("employees",employeeRepository.findAll());
		model.addAttribute("contractEmployees",contractEmployeeRepository.findAll());
		model.addAttribute("permanentEmployees",permanentEmployeeRepository.findAll());
		return "home";
	}
	@GetMapping("/addEmployee")
	public String addLeague() {
		return "addEmployee";
	}
}