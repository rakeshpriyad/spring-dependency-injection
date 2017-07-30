package com.stundent.spring.dependency.lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostConstructPreDestroyDemo {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring-config-post-construct-pre-dest.xml" });

		PaymentService payment = (PaymentService) context.getBean("paymentService");

		System.out.println(payment);

		context.close();
	}
}