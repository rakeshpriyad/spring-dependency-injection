package com.stundent.spring.dependency.injection;
/**
 * A --> B
 * B --> A
 * @author aayushraj
 *
 */
public class A {
	private String description;
	private B b;
	public A(B b, String description) {
		this.description = description;
		this.b = b;
	}

	public String getDescription() {
		return description;
	}

	public B getB() {
		return b;
	}
}
