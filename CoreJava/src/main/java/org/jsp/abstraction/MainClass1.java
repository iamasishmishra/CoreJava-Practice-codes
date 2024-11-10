package org.jsp.abstraction;

interface HotelFood{
	void order();
}

class VegFood implements HotelFood{
	public void order() {
		System.out.println("Veg food is being prepared..");
	}
}

class NonVegFood implements HotelFood{
	public void order() {
		System.out.println("Non-Veg food is being prepared..");
	}
}

class AllFoods{
	void order(HotelFood h1) {
		h1.order();
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		VegFood v1= new VegFood();
		NonVegFood n1 = new NonVegFood();
		AllFoods a1 = new AllFoods();
		a1.order(n1);
	}
}
