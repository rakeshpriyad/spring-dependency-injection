package com.stundent.spring.dependency.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 
 * @author aayushraj
 *
 */
@Service
@Scope("prototype")
public class AnnotationCustomerService {
	private String message;

	public AnnotationCustomerService() {
		System.out.println(" instance created");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}