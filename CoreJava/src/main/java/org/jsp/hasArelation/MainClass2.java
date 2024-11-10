package org.jsp.hasArelation;

class Car{
	private Engine engine;
	
	public Car(Engine engine) {
		this.engine  = engine;
	}
	public void startEngine() {
		System.out.println("car Started..");
		engine.run();
	}
}

class Engine{
	
	public void run() {
		System.out.println("Start Engine....");
	}
	
}

public class MainClass2 {
	public static void main(String[] args) {
		Engine e1 = new Engine();
		Car car = new Car(e1);
		car.startEngine();
	}
}
