package com.example.Employee.Controller;

import java.util.List;

import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee.EmployeeModel.Employees;
import com.example.Employee.Service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employee;
	
	@GetMapping("/employees")
	public List<Employees> getEmployee(){
		return employee.getEmployee();
	}
	
	@GetMapping("/employees/{employeeId}")
	public Employees getEmployeeById(@PathVariable("employeeId") int employeeId){
		return employee.getEmployeeById(employeeId);
	}
	
	
	@PutMapping("/employees")
	public void saveEmployee(@RequestBody Employees emp) {
		 employee.saveOrUpdate(emp);
	}
	
	@DeleteMapping("/employees/{employeeId}")
	public void deleteEmployee(@PathVariable("employeeId") Employees employeeId) {
		employee.delete(employeeId);
	}
	
}
