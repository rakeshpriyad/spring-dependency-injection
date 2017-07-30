package com.stundent.spring.dependency.innerbean;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerBeanDemo {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring-config-inner-bean.xml" });

		Customer cust = (Customer) context.getBean("CustomerBean");
		System.out.println(cust);

		Customer customer = (Customer) context.getBean("CustomerBeanConst");
		System.out.println(customer);
		context.close();
	}
}