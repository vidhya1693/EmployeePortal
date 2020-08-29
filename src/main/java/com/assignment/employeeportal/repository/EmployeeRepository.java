package com.assignment.employeeportal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.employeeportal.entity.Employee;

/**
 * This class is used to perform the crud operations
 * 
 * @author Srividya
 *
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
