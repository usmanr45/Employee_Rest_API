package com.example.Employee.EmployeeModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employees {

	@Id
	@Column
	private int emp_Id;
	@Column
	private String emp_Name;
	@Column
	private String Emp_mail;
	@Column
    private long emp_Salary;
	
	
	//Getters and Setters
	
	public int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	public String getEmp_mail() {
		return Emp_mail;
	}
	public void setEmp_mail(String emp_mail) {
		Emp_mail = emp_mail;
	}
	public long getEmp_Salary() {
		return emp_Salary;
	}
	public void setEmp_Salary(long emp_Salary) {
		this.emp_Salary = emp_Salary;
	}
	
	
	
}
