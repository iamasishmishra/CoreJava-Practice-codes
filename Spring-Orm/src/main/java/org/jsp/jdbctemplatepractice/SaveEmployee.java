package org.jsp.jdbctemplatepractice;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SaveEmployee {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-template.xml");
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee id, name, salary, designation to save: ");
		int id = sc.nextInt();
		String name = sc.next();
		double salary = sc.nextDouble();
		String desg = sc.next();
		
		String qry = "insert into employee values(?,?,?,?)";
		
		int r = template.update(qry, id,name,salary,desg);
		System.out.println( r + " rows inserted");
		
		sc.close();
		((ClassPathXmlApplicationContext) context).close();	
	}
}
