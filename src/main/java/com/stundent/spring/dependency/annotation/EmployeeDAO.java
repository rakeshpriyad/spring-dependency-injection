package com.stundent.spring.dependency.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component

public class EmployeeDAO {

@Autowired
private Employee emp;

@Override
public String toString(){
		return "This is Student DAO";
	}
public Employee getEmployee() {
	emp.setEmpNo(28);
	emp.setEmpName("Rajesh");
	emp.setDesin("MCA");
	emp.setAddr("New Delhi");
	emp.setMob("9971315859");
	return emp;
}
public void setStudent(Employee emp) {
	this.emp = emp;
}}

