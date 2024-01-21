package com.graphql.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graphql.poc.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}
