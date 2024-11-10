package org.jsp.inheritanceAndSuper;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Person1{
	String name;
	String address;
	
	public void printDetails() {
		System.out.println("The name is : "+ name + " and the address is : "+ address);
	}
}

class Employee1 extends Person1{
	int id;
	String desg;
	
	Employee1(String name, String address, int id, String desg){
		super(name, address);
		this.id=id;
		this.desg=desg;
	}
	
	@Override
	public void printDetails() {
		System.out.println("The name is : "+ name + " and the address is : "+ address + "\n"
				+ " the id is: "+ id+ " the designation is: "+ desg);
	}
}

public class MethodOverriding2 {
	public static void main(String[] args) {
		Person1 p1 = new Person1("Bhupendra", "Btm");
		p1.printDetails();
		
		Employee1 e1 = new Employee1("Nithin", "White Field", 123, "Product Specialist");
		e1.printDetails();
	}
}
