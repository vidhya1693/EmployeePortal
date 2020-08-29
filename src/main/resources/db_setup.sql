CREATE DATABASE `employee`;

CREATE TABLE `employee`.`ep_employee` (
  `employee_id` INT NOT NULL,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `gender` VARCHAR(45) NULL,
  `dob` DATE NULL,
  `department` VARCHAR(20) NULL);