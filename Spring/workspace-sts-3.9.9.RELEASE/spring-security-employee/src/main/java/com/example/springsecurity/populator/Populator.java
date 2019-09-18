package com.example.springsecurity.populator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.springsecurity.entity.ContractEmployee;
import com.example.springsecurity.entity.Employee;
import com.example.springsecurity.entity.PermanentEmployee;
import com.example.springsecurity.repository.ContractEmployeeRepository;
import com.example.springsecurity.repository.EmployeeRepository;
import com.example.springsecurity.repository.PermanentEmployeeRepository;

@Component
public class Populator implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private ContractEmployeeRepository contractEmployeeRepository;
	@Autowired
	private PermanentEmployeeRepository permanentEmployeeRepository;
	
	private Employee employee;
	private ContractEmployee contractEmployee;
	private PermanentEmployee permanentEmployee;
	
	public void onApplicationEvent(ContextRefreshedEvent event) {
		populate();
	}

	private void populate() {
		employee  = new Employee("Riki","Maru","riki@gg.com");
		employeeRepository.save(employee);
		contractEmployee = new ContractEmployee("Phantom","Lancer","pl@gg.com","20 GPM","2 hours");
		contractEmployeeRepository.save(contractEmployee);
		permanentEmployee = new PermanentEmployee("Anti","Mage","am@gg.com","4.5 LPA","45 gold");
		permanentEmployeeRepository.save(permanentEmployee);
	}

}
