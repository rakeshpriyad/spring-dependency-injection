package com.stundent.spring.dependency.injection.set;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UtilSetBeanDemo {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring-config-utilset.xml" });

		MyBean bean = (MyBean) context.getBean("myBean");
		System.out.println(bean);
		context.close();
	}
}