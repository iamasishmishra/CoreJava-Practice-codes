package org.jsp.polymerphism;



//Runtime Polymerphism
class Animal{
	void noise() {
		System.out.println("Every animal makes noise..");
	}
}

class Dog extends Animal{
	void noise() {
		System.out.println("Bow Bow...");
	}
}

class Cat extends Animal{
	void noise() {
		System.out.println("Meow Meow...");
	}
}

class AnimalSimulator{
	void makeNoise(Animal animal) {
		animal.noise();
	}
}

public class OrginalClass {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		AnimalSimulator a1 = new AnimalSimulator();
		a1.makeNoise(d1);
		a1.makeNoise(c1);
	}
}
