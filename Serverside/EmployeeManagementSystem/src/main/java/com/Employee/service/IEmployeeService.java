package com.Employee.service;

import java.util.List;
import java.util.Optional;

import com.Employee.Entity.Employee;

public interface IEmployeeService {
	
	Integer saveEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	Optional<Employee> getEmployee(Integer id);
	
	public void deleteEmployee(Integer id);
	
	Employee updateEmployee(Employee employee, Integer id);

}
