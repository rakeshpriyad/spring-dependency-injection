package com.stundent.spring.dependency.scope;

/**
 * 
 * @author aayushraj
 *
 */
public class CustomerService {
	private String message;

	public CustomerService() {
		System.out.println(" instance created");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}