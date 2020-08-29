package com.assignment.employeeportal.service;

import java.util.List;

import com.assignment.employeeportal.entity.Employee;

/**
 * This service has methods that does crud operations for employee
 * 
 * @author Srividya
 *
 */
public interface EmployeeService {

	/**
	 * Method to persist employee details
	 * 
	 * @param emp
	 *            {@link Employee}
	 */
	public void saveEmployee(Employee emp);

	/**
	 * Method to retrieve all the Employees in the sorted order of the first name
	 * 
	 * @return {@link List<Employee>}
	 */
	public List<Employee> getAllEmployee();

}
