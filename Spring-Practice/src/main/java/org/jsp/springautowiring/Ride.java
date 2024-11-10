package org.jsp.springautowiring;

public class Ride {
	
	Vehicle vehicle;
	
	public Ride() {
	}
	
	public Ride(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}
