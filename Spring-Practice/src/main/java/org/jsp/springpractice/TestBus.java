package org.jsp.springpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBus {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bike-engine.xml");
		Bus myBus = context.getBean("myBus", Bus.class);
		myBus.getEngine().start();
		
		Bus urBus = context.getBean("urBus", Bus.class);
		urBus.getEngine().start();
		
	}

}
