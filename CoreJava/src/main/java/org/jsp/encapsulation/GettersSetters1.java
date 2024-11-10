package org.jsp.encapsulation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
class Person{
	private int id;
	private String name;
	private double salary;
	
	
}

public class GettersSetters1 {
	public static void main(String[] args) {
		 Person p1 = new Person(101, "Archit", 33000.0);
		 System.out.println("The id of the Person is: "+ p1.getId());
		 System.out.println("The name of the Person is: "+ p1.getName());
		 System.out.println("The salary of the Person is: "+ p1.getSalary());
		 
		 System.out.println("Changing the salary");
		 p1.setSalary(90000.00);
		 System.out.println("Now the salary is: "+ p1.getSalary());
	}
}
