package com.assignment.employeeportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.employeeportal.entity.Employee;
import com.assignment.employeeportal.service.EmployeeService;


@RestController
	public class EmployeeController {
		
		
		@Autowired
		EmployeeService  employeeService;
		
		@RequestMapping(value="/employee",method=RequestMethod.POST)
		public void saveEmployee(@RequestBody Employee emp){
			employeeService.saveEmployee(emp);
		}
		
		@RequestMapping(value="/employee",method=RequestMethod.GET)
		public List<Employee> getAllEmployee(){
			return employeeService.getAllEmployee();
		}

	}
