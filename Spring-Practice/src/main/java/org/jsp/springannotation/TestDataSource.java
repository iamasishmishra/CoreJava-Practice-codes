package org.jsp.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDataSource {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		MyDataSource s = context.getBean("myDataSource", MyDataSource.class);
		s.display();
	}

}
