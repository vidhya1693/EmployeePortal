package com.assignment.employeeportal.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.employeeportal.entity.Employee;
import com.assignment.employeeportal.service.EmployeeService;

import io.swagger.annotations.ApiOperation;

/**
 * Controller class to handle the request based on requested mapping
 * 
 * @author Srividya
 *
 */
@RestController
public class EmployeeController {

	Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	EmployeeService employeeService;

	@PostMapping(value = "/employee")
	@ApiOperation("API to create Employee details")
	public void saveEmployee(@RequestBody Employee emp) {
		logger.trace("EmployeeController :: saveEmployee :: Method entry");
		employeeService.saveEmployee(emp);
		logger.info("Persisting Employee successful");
		logger.trace("EmployeeController :: saveEmployee :: Method exit");
	}

	@GetMapping(value = "/employee")
	@ApiOperation("API to get all the Employees detail")
	public List<Employee> getAllEmployee() {
		logger.trace("EmployeeController :: getAllEmployee :: Method entry");

		List<Employee> employee = employeeService.getAllEmployee();
		logger.info("Retriving Employees successful : {0}", employee.toString());

		logger.trace("EmployeeController :: getAllEmployee :: Method exit");
		return employee;
	}

}
