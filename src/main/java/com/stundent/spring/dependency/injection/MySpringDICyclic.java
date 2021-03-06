package com.stundent.spring.dependency.injection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringDICyclic {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

		A a = (A) context.getBean("a");
		System.out.println(a.getB().getDescription());
		System.out.println(a.getDescription());
		context.close();
	}
}
