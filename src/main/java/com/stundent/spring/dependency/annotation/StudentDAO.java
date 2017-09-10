package com.stundent.spring.dependency.annotation;

public class StudentDAO {

private Student student;
public String toString(){
		return "This is Student DAO";
	}
public Student getStudent() {
	student.setRoll(28);
	student.setsName("Rajesh");
	student.setCourse("MCA");
	student.setAddr("New Delhi");
	student.setMob("9971315859");
	student.setSem(5);
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
}
