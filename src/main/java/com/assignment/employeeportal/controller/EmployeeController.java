package com.assignment.employeeportal.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public void saveEmployee(@RequestBody Employee emp) {
		logger.debug("EmployeeController :: saveEmployee :: Method entry");
		employeeService.saveEmployee(emp);
		logger.info("Persisting Employee successful");
		logger.debug("EmployeeController :: saveEmployee :: Method exit");
	}

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public List<Employee> getAllEmployee() {
		logger.debug("EmployeeController :: getAllEmployee :: Method entry");

		List<Employee> employee = employeeService.getAllEmployee();
		logger.info("Retriving Employees successful : {0}", employee.toString());

		logger.debug("EmployeeController :: getAllEmployee :: Method exit");
		return employee;
	}

}
