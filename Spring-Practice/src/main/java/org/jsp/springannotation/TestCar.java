package org.jsp.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		Car c = context.getBean("car", Car.class);
		c.start();	
	}
}
