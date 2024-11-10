package org.jsp.springannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBike {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Bike.class, TestBike.class);
		context.refresh();
		Bike b = context.getBean("bike", Bike.class);
		b.start();
	}

}
