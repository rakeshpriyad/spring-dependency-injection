package com.stundent.spring.dependency.annotation;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int empNo;
	private String empName;
	private String desin;
	private String addr;
	private String mob;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesin() {
		return desin;
	}
	public void setDesin(String desin) {
		this.desin = desin;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	

}
