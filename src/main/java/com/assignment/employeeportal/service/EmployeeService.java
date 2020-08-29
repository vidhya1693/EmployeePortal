package com.assignment.employeeportal.service;



import java.util.List;

import com.assignment.employeeportal.entity.Employee;
/**
 * This service has methods that does crud operations for employee
 * @author Srividya
 *
 */
public interface EmployeeService {
	
	public void saveEmployee(Employee emp);
	
	public List<Employee> getAllEmployee();

}
