package com.stundent.spring.dependency.injection.map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UtilMapBeanDemo {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring-config-utilmap.xml" });

		MyBean bean = (MyBean) context.getBean("myBean");
		System.out.println(bean);
		context.close();
	}
}