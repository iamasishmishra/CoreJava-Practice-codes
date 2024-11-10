package org.jsp.springautowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CheckBalance {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringAutowiredConfig.class);
		PhonePe pe = context.getBean(PhonePe.class);
		System.out.println(pe.getAccount().getBalance());
	}
}
