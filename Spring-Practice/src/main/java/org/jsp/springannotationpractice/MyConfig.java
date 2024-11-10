package org.jsp.springannotationpractice;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "app.properties")
@ComponentScan(basePackages = {"org.jsp.springannotationpractice"})
public class MyConfig {
	
	@Bean
	public List<String> getMappingResources(){
		
		return Arrays.asList("hibernate.hbm.xml","Employee.cfg.xml");
	} 
	
	@Bean
	@Primary
	public Properties gethibernateProperties() {
		
		Properties p = new Properties();
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		p.setProperty("hibernate.hbm2ddl_auto", "update");
		p.setProperty("hibernate.show_sql", "true");
		p.setProperty("hibernate.format_sql", "true");
		
		return p;
	}
}
