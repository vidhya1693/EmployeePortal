package com.assignment.employeeportal.impl;



import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.employeeportal.controller.EmployeeController;
import com.assignment.employeeportal.entity.Employee;
import com.assignment.employeeportal.repository.EmployeeRepository;
import com.assignment.employeeportal.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public void saveEmployee(Employee emp){
		employeeRepository.save(emp);
		logger.info("Employee persited successfully");
		
	}
	
	public List<Employee> getAllEmployee(){
		List<Employee> employeeList=new ArrayList<>();
		employeeList= (List<Employee>) employeeRepository.findAll();
		logger.info("Employees retrieved successfully without sorting {}", employeeList);
		employeeList.sort(new java.util.Comparator<Employee>() {
			public int compare(Employee e1,Employee e2) {
				return e1.getFirstName().compareTo(e2.getFirstName());
			}
			
			
		});;
		return employeeList;
	}

}
