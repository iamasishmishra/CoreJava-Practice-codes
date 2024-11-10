package org.jsp.springautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRide {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
		Ride ride = context.getBean("ride", Ride.class);
		ride.getVehicle().startRide();
		
	}
}
