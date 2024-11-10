package org.jsp.springpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSessionFactory {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("hibernate.xml");
		MySessionFactory sessionFactory = context.getBean("mySessionFactory", MySessionFactory.class);
		
		System.out.println("Mapping Resource : " + sessionFactory.getMappingResouces());
		System.out.println(sessionFactory.getDataSource());
		System.out.println("Hibernate Properties : " + sessionFactory.getHibernateProperties());
	}
}
