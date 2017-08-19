package com.stundent.spring.dependency.autowire;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireByNameDemo {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring-config-autowire-byname.xml" });

		Customer cust = (Customer) context.getBean("customer");
		System.out.println(cust);

		Customer customer = (Customer) context.getBean("customer");
		Person person = customer.getPerson();
		System.out.println(person.getPersonId());
		System.out.println(person.getPersonName());
		context.close();
	}
}