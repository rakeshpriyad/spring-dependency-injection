package com.stundent.spring.dependency.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	// you want autowired this field.
	//@Autowired
	//Caused by: org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'com.stundent.spring.dependency.autowire.annotation.Person' available: expected single matching bean but found 2: personA,personB

	@Autowired
	@Qualifier("personA")
	private Person person;
	private int type;
	private String action;
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}