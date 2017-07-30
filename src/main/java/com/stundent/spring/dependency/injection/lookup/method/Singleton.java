package com.stundent.spring.dependency.injection.lookup.method;

public abstract class Singleton {

	public Singleton(){
		System.out.println("Singleton created.");
	}
	/*
	 * private Prototype prototype;
	 * 
	 * public Singleton(Prototype prototype) {
	 * 
	 * this.prototype = prototype; }
	 * 
	 * public void doSomething() {
	 * 
	 * prototype.foo(); }
	 * 
	 * public void doSomethingElse() {
	 * 
	 * prototype.bar(); }
	 */

	protected abstract Prototype createPrototype();

	public void doSomething() {
		createPrototype().foo();
	}

	public void doSomethingElse() {
		createPrototype().bar();
	}
}