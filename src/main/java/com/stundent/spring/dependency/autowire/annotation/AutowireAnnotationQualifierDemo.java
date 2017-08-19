package com.stundent.spring.dependency.autowire.annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireAnnotationQualifierDemo {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring-config-autowire-annotation-qualifier.xml" });
		Emp emp = (Emp) context.getBean("emp");
		Person person = emp.getPerson();
		System.out.println(person.getPersonId());
		System.out.println(person.getPersonName());
		context.close();
	}
}