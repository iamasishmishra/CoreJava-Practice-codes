package org.jsp.collection.List;
import java.util.ArrayList;

class Pen {
	String color;
	String brand;

	public Pen(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}
}

class Notebook {
	String color;
	String brand;

	public Notebook(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}
}

class Student {
	int id;
	String name;
	double mark;

	public Student(int id, String name, double mark) {
		this.id = id;
		this.name = name;
		this.mark=mark;
	}
}

class Employee {
	int id;
	String name;
	String desg;

	public Employee(int id, String name, String desg) {
		this.id = id;
		this.name = name;
		this.desg = desg;
	}
}

public class ArrayListPractice {
	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		
		arraylist.add(new Student(12, "Badal", 95.6));
		arraylist.add(new Pen("black", "Elkos"));
		arraylist.add(new Notebook("blue", "Classmate"));
		arraylist.add(new Employee(123, "Lakhan", "developer"));
		
		System.out.println("No of element present in array : "+ arraylist.size());
		System.out.println(arraylist);
		
		for(Object a: arraylist) {
			System.out.println(a);
		}
	}
}
