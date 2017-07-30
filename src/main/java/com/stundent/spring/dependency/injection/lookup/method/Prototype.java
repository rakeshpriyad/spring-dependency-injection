package com.stundent.spring.dependency.injection.lookup.method;

public class Prototype {

	public Prototype(){
		System.out.println(" Prototype created");
	}
	
	public void foo(){
		System.out.println(" Foo method called");
	}
	
	public void bar(){
		System.out.println(" Bar method called");
	}
}
