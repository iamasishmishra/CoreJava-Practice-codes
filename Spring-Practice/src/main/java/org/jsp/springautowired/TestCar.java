package org.jsp.springautowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCar {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringAutowiredConfig.class);
		Car c = context.getBean("car", Car.class);
		c.getE().start();
	}
}
