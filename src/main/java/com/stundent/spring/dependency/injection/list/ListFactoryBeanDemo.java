package com.stundent.spring.dependency.injection.list;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListFactoryBeanDemo {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring-config-listfactory.xml" });

		MyBean bean = (MyBean) context.getBean("myBean");
		System.out.println(bean);
		context.close();
	}
}