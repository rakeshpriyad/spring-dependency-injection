package com.stundent.spring.dependency.injection.map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapFactoryBeanDemo {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring-config-mapfactory.xml" });

		MyBean bean = (MyBean) context.getBean("myBean");
		System.out.println(bean);
		context.close();
	}
}