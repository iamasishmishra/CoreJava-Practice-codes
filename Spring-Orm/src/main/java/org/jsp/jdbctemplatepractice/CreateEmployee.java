package org.jsp.jdbctemplatepractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class CreateEmployee {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-template.xml");
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		
		String qry = "create table employee( id int not null, name varchar(45) not null, salary decimal not null, desg varchar(45) not null, primary key(id))";
		
		template.execute(qry);
		System.out.println("Table created");
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
