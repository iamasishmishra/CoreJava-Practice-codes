package org.jsp.inheritanceAndSuper;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Person{
	String name;
	String address;
	long phoneno;
	
	void displayPerson() {
		System.out.println("Name is: "+ name + " Address is: "+ address + " phoneno : "+ phoneno);
	}
}

class Employee extends Person{
	int id;
	double salary;
	
	public Employee(String name, String address, long phoneno, int id, double salary) {
		super(name,address,phoneno);
		this.id=id;
		this.salary=salary;
	}
	
	void displayEmployee() {
		System.out.println("Name is: "+ name + " Address is: "+ address + " phoneno : "+ phoneno + " id : "+ id+ " Sal: "+ salary);
	}
}

class Student extends Person{
	int id;
	double marks;
	
	public Student(String name, String address, long phoneno, int id, double marks) {
		super(name, address, phoneno);
		this.id=id;
		this.marks=marks;
	}
	
	void displayStudent() {
		System.out.println("Name is: "+ name + " Address is: "+ address + " phoneno : "+ phoneno + " id: "+ id+ " marks: "+ marks);
	}
}

public class SuperMethod {
	public static void main(String[] args) {
		Person p1 = new Person("Krishna", "Bbsr", 909080l);
		p1.displayPerson();
		Employee e1 = new Employee("Elina", "Talcher", 6778899l, 123, 33000.00);
		e1.displayEmployee();
		Student s1 = new Student("Chandan", "Boinda", 33445522l,1200, 90.3);
		s1.displayStudent();
	}

}
