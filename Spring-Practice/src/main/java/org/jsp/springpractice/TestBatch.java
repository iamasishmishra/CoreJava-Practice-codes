package org.jsp.springpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBatch {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("batch.xml");
		Batch batch = context.getBean("batch", Batch.class);
		
		System.out.println("Names : " + batch.getNames());
		System.out.println("Phone numbers : " + batch.getPhone_ns());
		System.out.println("Details : " + batch.getDetails());
		System.out.println("Properties values : " + batch.getD());
	}

}
