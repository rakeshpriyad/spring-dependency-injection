package com.stundent.spring.dependency.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stundent.spring.dependency.annotation.EmployeeDAO;

@Component
public class EmpService {
	EmployeeDAO employeeDAO;

	@Autowired
	public EmpService(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
}