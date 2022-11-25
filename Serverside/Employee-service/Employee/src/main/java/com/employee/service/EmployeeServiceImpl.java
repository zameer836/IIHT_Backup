package com.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
@Service
public class EmployeeServiceImpl implements IEmployeeService {

	List<Employee> list = List.of(
			new Employee(1311L, "Nishant Gupta", "1234567891"),
			new Employee(1312L, "Nishant Gupta1", "1234567891"),
			new Employee(1313L, "Nishant Gupta2", "1234567891"),
			new Employee(1314L, "Nishant Gupta3", "1234567891"),
			new Employee(1315L, "Nishant Gupta4", "1234567891"),
			new Employee(1316L, "Nishant Gupta5", "1234567891"),
			new Employee(1317L, "Nishant Gupta6", "1234567891"),
			new Employee(1318L, "Nishant Gupta7", "1234567891"),
			new Employee(1319L, "Nishant Gupta8", "1234567891")	);
	
	
	@Override
	public Employee getEmployee(Long id) {
		// TODO Auto-generated method stub
		return  list.stream().filter(employee ->employee.getEmpId().equals(id)).findAny().orElse(null);
	}

	
}
