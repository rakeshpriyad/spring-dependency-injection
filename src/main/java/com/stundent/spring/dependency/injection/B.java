package com.stundent.spring.dependency.injection;

public class B {
	private String description;
	private A a;
	public B(A a, String description) {
		this.description = description;
		this.a = a;
	}

	public String getDescription() {
		return description;
	}

	public A getA() {
		return a;
	}

	
}
