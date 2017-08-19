package com.stundent.spring.dependency.scope;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonDemo {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring-config-scope-singleton.xml" });
		CustomerService custA = (CustomerService) context.getBean("customerService");
		custA.setMessage("Message by custA");
		System.out.println("Message : " + custA.getMessage());

		// retrieve it again
		CustomerService custB = (CustomerService) context.getBean("customerService");
		System.out.println("Message : " + custB.getMessage());
		context.close();
	}
}