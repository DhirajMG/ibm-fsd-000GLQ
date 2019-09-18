package com.example.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springsecurity.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
