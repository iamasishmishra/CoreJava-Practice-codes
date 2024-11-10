package org.jsp.springannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OpenPaytm {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Paytm p = context.getBean("paytm", Paytm.class);
		
		p.open();
	}
}
