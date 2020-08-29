package com.assignment.employeeportal;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.assignment.employeeportal.entity.Employee;
import com.assignment.employeeportal.repository.EmployeeRepository;
import com.assignment.employeeportal.service.EmployeeService;

//import static junit.framework.Assert.;



@RunWith(MockitoJUnitRunner.class)
class EmployeeportalApplicationTests {
	
	@Mock
	EmployeeRepository employeeRepository;
	
	@Autowired
	EmployeeService service;
	
	@SuppressWarnings("deprecation")
	@Test
    public void testEmployeeSort() {
		
		List<Employee> employees=new ArrayList<>();
		Employee e1=new Employee();
		e1.setEmpId(1);
		e1.setFirstName("sri");
		e1.setLastName("vidya");
		e1.setGender("female");
		e1.setDob(new Date("12-08-2000"));
		e1.setDepartment("IT");
		employees.add(e1);
		
		Employee e2=new Employee();
		e1.setEmpId(1);
		e1.setFirstName("kathy");
		e1.setLastName("paul");
		e1.setGender("female");
		e1.setDob(new Date("12-09-2000"));
		e1.setDepartment("CS");
		employees.add(e2);
		
		Employee e3=new Employee();
		e1.setEmpId(1);
		e1.setFirstName("Arun");
		e1.setLastName("kumar");
		e1.setGender("female");
		e1.setDob(new Date("04-08-2000"));
		e1.setDepartment("IT");
		employees.add(e3);
		
		Mockito.when(employeeRepository.findAll()).thenReturn(employees);
		List<Employee> result=service.getAllEmployee(); 
		assertEquals("Arun", result.get(0).getFirstName());
	
}
	


}
