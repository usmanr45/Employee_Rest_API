package com.example.Employee.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employee.DAO.EmployeeDao;
import com.example.Employee.EmployeeModel.Employees;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao empDao;
	
	// List of Employees
	public List<Employees> getEmployee() {
		List<Employees> emp=new ArrayList<>();
		empDao.findAll().forEach(emp1->emp.add(emp1));
		return emp;
	}

	
	//returns Employee by employeeId
	public Employees getEmployeeById(int empId) {
		
	return	 empDao.findById(empId).get();
	}

	//save and update employee
	public Employees  saveOrUpdate(Employees emp) {
	     return empDao.save(emp);	 
	}


	//delete Employee
	public void delete(Employees employeeId) {
		 empDao.delete(employeeId);
		
	}
	
	
	
}
