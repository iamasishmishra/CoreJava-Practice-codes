package org.jsp.jdbctemplatepractice;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class DeleteEmployee {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-template.xml");
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee id to delete employee: ");
		int id = sc.nextInt();
		
		String qry = "delete from employee where id = ?";
		
		int r = template.update(qry, id);
		System.out.println( r + " rows deleted");
		
		sc.close();
		((ClassPathXmlApplicationContext) context).close();	
	}

}
