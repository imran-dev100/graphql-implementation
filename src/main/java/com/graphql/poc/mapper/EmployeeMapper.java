package com.graphql.poc.mapper;

import org.springframework.stereotype.Component;

import com.graphql.poc.dto.EmployeeDto;
import com.graphql.poc.entity.Employee;

@Component
public class EmployeeMapper {

	public Employee convertToEntity(EmployeeDto employeeDto) {
		return Employee.builder().name(employeeDto.getName()).age(employeeDto.getAge()).build();
	}
}
