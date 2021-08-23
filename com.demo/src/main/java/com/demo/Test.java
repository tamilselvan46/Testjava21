package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");

		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(MyConfigurations.class);
		
		
		context.close();
		
	}

}
