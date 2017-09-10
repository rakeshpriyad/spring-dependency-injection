package com.stundent.spring.dependency.annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class EmpScanDemo {

	public static void main(String[] args) {
ConfigurableApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"spring-config-component-scan.xml"});
EmpService es=(EmpService) context.getBean("empService");
EmployeeDAO ed=es.getEmployeeDAO();
Employee emp=ed.getEmployee();
System.out.println(emp.getEmpNo());
System.out.println(emp.getEmpName());
System.out.println(emp.getDesin());
System.out.println(emp.getAddr());
System.out.println(emp.getMob());
	
	
	
	}
}
