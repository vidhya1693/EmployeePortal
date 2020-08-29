package com.assignment.employeeportal.service;



import java.util.List;

import com.assignment.employeeportal.entity.Employee;

public interface EmployeeService {
	
	public void saveEmployee(Employee emp);
	
	public List<Employee> getAllEmployee();

}
