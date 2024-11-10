package org.jsp.springautowired;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("org.jsp.springautowired")
public class SpringAutowiredConfig {
	
	@Bean
	public List<String> getNames(){
		return Arrays.asList("ABC", "XYZ", "PQR");
	}
	
	@Bean
	@Primary
	public List<String> getEmployeeNames(){
		return Arrays.asList("Virat", "Rohit", "Rahul");
	}
}
