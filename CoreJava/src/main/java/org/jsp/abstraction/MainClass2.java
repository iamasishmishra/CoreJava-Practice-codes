package org.jsp.abstraction;

interface User{
	void transfer();
}

class Atm implements User{
	public void transfer() {
		System.out.println("Atm is working..");
	}
}

class Gpay implements User{
	public void transfer() {
		System.out.println("Gpay is working..");
	}
}

class TypeOfUser{
	void allPayments(User u1) {
		u1.transfer();
	}
}

public class MainClass2 {
	public static void main(String[] args) {
		TypeOfUser t1 = new TypeOfUser();
		t1.allPayments(new Gpay());
	}
}
