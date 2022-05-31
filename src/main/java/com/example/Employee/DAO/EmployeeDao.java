package com.example.Employee.DAO;


import org.springframework.data.repository.CrudRepository;


import com.example.Employee.EmployeeModel.Employees;

public interface EmployeeDao extends CrudRepository<Employees, Integer> {

	

}
