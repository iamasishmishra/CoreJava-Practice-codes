package org.jsp.collection.List;

import java.util.ArrayList;

class Pen1 {
	String color;
	String brand;

	public Pen1(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}
}

class Notebook1 {
	String color;
	String brand;

	public Notebook1(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}
}

class Student1 {
	int id;
	String name;
	double mark;

	public Student1(int id, String name, double mark) {
		this.id = id;
		this.name = name;
		this.mark=mark;
	}
}

class Employee1 {
	int id;
	String name;
	String desg;

	public Employee1(int id, String name, String desg) {
		this.id = id;
		this.name = name;
		this.desg = desg;
	}
}
public class ArrayListPractice2 {
	public static void main(String[] args) {
		ArrayList<Employee1> empList = new ArrayList<Employee1>();
		empList.add(new Employee1(12, "Sambhu", "Developer"));
		empList.add(new Employee1(13, "Naughty Nithin", "Support"));
		empList.add(new Employee1(17, "Raju", "Data analyst"));
		
		System.out.println("Total employee: "+ empList.size());
		System.out.println(empList.get(0));
		empList.add(3,new Employee1(20, "Rashid", "Data Vb"));
		System.out.println(empList.indexOf(2));
		System.out.println(empList.lastIndexOf(3));
		
		System.out.println("Employee details: ");
		for(Employee1 emp: empList) {
			System.out.println(emp.id+ " "+ emp.name+ " "+  emp.desg);
		}
		
	}
}
