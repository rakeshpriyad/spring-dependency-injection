package com.stundent.spring.dependency.annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentScanDemo {

	public static void main(String[] args) {
ConfigurableApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"spring-config.xml"});
StudentServices stud=(StudentServices) context.getBean("studentService");
StudentDAO studentDAO=stud.getStudentDAO();
Student std=studentDAO.getStudent();
System.out.println(std.getRoll());
System.out.println(std.getsName());
System.out.println(std.getCourse());
System.out.println(std.getSem());

System.out.println(std.getAddr());
System.out.println(std.getMob());
context.close();
}

	}


