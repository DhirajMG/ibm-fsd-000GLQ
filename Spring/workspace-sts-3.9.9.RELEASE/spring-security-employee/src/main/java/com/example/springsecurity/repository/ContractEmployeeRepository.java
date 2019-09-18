package com.example.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springsecurity.entity.ContractEmployee;

@Repository
public interface ContractEmployeeRepository extends JpaRepository<ContractEmployee, Integer> {

}