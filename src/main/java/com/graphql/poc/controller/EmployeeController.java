package com.graphql.poc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.graphql.poc.dto.EmployeeDto;
import com.graphql.poc.entity.Employee;
import com.graphql.poc.service.EmployeeService;

/**
 * imran.ansari
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@MutationMapping("createEmployee")
	public Employee createEmployee(@Argument EmployeeDto employeeDto) {
		return employeeService.createOrUpdateEmployee(employeeDto);
	}
	
	@QueryMapping("listEmployees")
	public List<Employee> listEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@QueryMapping("getEmployeeById")
	public Employee getEmployeeById(@Argument long id){
		return employeeService.fetchById(id);
	}
}
