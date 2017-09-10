package com.stundent.spring.dependency.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class StudentServices {
private StudentDAO studentDAO;
public StudentServices(StudentDAO studentDAO){
	this.studentDAO=studentDAO;
	}

public String toString() {
	return "StudentServices [studentDAO=" + studentDAO + "]";
}

public StudentDAO getStudentDAO() {
	return studentDAO;
}

public void setStudentDAO(StudentDAO studentDAO) {
	this.studentDAO = studentDAO;
}


}
