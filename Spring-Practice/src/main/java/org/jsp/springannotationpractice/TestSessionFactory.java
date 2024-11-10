package org.jsp.springannotationpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSessionFactory {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		MySessionFactory factory = context.getBean(MySessionFactory.class);
		System.out.println(factory.getDataSource());
		System.out.println(factory.getMappingResources());
		System.out.println(factory.getHibernateProperties());
		
		((AnnotationConfigApplicationContext) context).close();
	}

}
