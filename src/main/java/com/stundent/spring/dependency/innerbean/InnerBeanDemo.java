package com.stundent.spring.dependency.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerBeanDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring-config-inner-bean.xml" });

		Customer cust = (Customer) context.getBean("CustomerBean");
		System.out.println(cust);
		
		Customer customer = (Customer) context.getBean("CustomerBeanConst");
		System.out.println(customer);
		

	}
}