package com.stundent.spring.dependency.autowire.annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireAnnotationconfigDemo {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring-config-autowire-annotation-config.xml" });
		Customer customer = (Customer) context.getBean("customer");
		Person person = customer.getPerson();
		System.out.println(person.getPersonId());
		System.out.println(person.getPersonName());
		context.close();
	}
}