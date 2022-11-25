package com.record.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.record.entity.EmploymentRecord;

@Service
public class RecordServiceImpl implements IRecordService {
	
	 List<EmploymentRecord> list = List.of(
			 new EmploymentRecord(101L, "Wipro", "wiprohq@gmail.com", 5, 1311L),
			 new EmployementRecord(102L, "TCS", "tcs@gmail.com", 3, 1312L),
			 new EmployementRecord(103L, "Tech Mahindra", "techm@gmail.com", 6, 1313L),
			 new EmployementRecord(104L, "Cognizant", "cts@gmail.com", 10, 1314L),
			 new EmployementRecord(105L, "Tesla", "tesla@gmail.com", 3, 1315L),
			 new EmployementRecord(106L, "Google", "google@gmail.com", 7, 1316L),
			 new EmployementRecord(107L, "Lenovo", "lenovo@gmail.com", 2, 1317L),
			 new EmployementRecord(108L, "Dell", "dell@gmail.com", 3, 1318L),
			 new EmployementRecord(109L, "Samsung", "samsung@gmail.com", 10, 1319L)
			 	 
			 );
	 
	 @Override
	 public List<EmployementRecord> getRecordOfEmployee(Long empId) {
		 return list.stream().filter(employementRecord -> employmentRecord.getEmpId().equals(empId)).collect(Collectors.toList())

	 }
	
	
}	


