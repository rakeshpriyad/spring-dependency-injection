package com.stundent.spring.dependency.scope;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeAnnotationDemo {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring-config-scope-annot-prototype.xml" });
		AnnotationCustomerService custA = (AnnotationCustomerService) context.getBean("annotationCustomerService");
		custA.setMessage("Message by custA");
		System.out.println("Message : " + custA.getMessage());

		// retrieve it again
		AnnotationCustomerService custB = (AnnotationCustomerService) context.getBean("annotationCustomerService");
		System.out.println("Message : " + custB.getMessage());
		context.close();
	}
}