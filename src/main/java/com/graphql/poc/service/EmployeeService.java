package com.graphql.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graphql.poc.dto.EmployeeDto;
import com.graphql.poc.entity.Employee;
import com.graphql.poc.mapper.EmployeeMapper;
import com.graphql.poc.repository.EmployeeRepository;

/**
 * imran
 */
@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private EmployeeMapper employeeMapper;

	public Employee createOrUpdateEmployee(EmployeeDto employeeDto) {
		return employeeRepository.save(employeeMapper.convertToEntity(employeeDto));
	}

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public Employee fetchById(long id) {
		return employeeRepository.findById(id).orElseThrow();
	}
}
