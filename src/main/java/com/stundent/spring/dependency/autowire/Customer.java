package com.stundent.spring.dependency.autowire;

public class Customer {
	private Person person;

	public Customer() {
	}
	
	public Customer(Person person) {
		this.person = person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Person getPerson() {
		return person;
	}
}