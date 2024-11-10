package org.jsp.springpractice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class TestCar {

	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("car.xml");
//		Resource r = new FileSystemResource("absolute path of car.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		
		Car c = (Car) factory.getBean("myCar");
//	 	c = factory.getBean("myCar", Car.class);
//     	c = factory.getBean(Car.class);
		c.start();
	}

}
