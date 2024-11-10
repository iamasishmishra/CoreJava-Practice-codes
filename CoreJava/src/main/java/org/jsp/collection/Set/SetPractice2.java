package org.jsp.collection.Set;

import java.util.HashSet;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Employee {
	String name;
	int id;
	double salary;
	String desg;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", desg=" + desg + "]";
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e1 = (Employee) obj;
		return e1.hashCode() == this.hashCode();
	}
}


public class SetPractice2 {
	public static void main(String[] args) {
		HashSet<Employee> e1= new HashSet<Employee>();
		e1.add(new Employee("Bhupendra", 12, 78000.00, "Teacher"));
		e1.add(new Employee("Sambhu", 14, 72000.00, "Developer"));
		e1.add(new Employee("Utkal", 17, 22000.00, "Frontend"));
		e1.add(new Employee("Utkal", 17, 22000.00, "Frontend"));
		e1.add(new Employee("Ashutosh", 10, 19000.00, "backend"));
		e1.add(new Employee("Panda", 11, 99000.00, "Trainer"));
		
		System.out.println(e1.size());
		System.out.println(e1);
		
		System.out.println("-----------------------");
		for(Object o1: e1) {
			System.out.println(o1);
		}
	}
}
