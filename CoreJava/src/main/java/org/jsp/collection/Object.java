package org.jsp.collection;



class Person1{
	int id;
	String name;
	String job;
	
	public Person1(int id, String name, String job) {
		this.id=id;
		this.name=name;
		this.job=job;
	}
	
}

public class Object {
	public static void main(String[] args) {
		
		Person1 p1 = new Person1(12, "Shrikant", "Developer");
		Person1 p2 = new Person1(13, "Shrikant", "Developer");
		Person1 p3 = new Person1(17, "Shrikant", "Developer");
		Person1 p4 = new Person1(19, "Shrikant", "Developer");
		
		Person1 person[] = new Person1[4];
		person[0] = p1;
		person[1] = p2;
		person[2] = p3;
		person[3] = p4;
		
		System.out.println("Person details..");
		System.out.println("------------------");
		
		for(Person1 per: person) {
		
				System.out.println("Person id: "+ per.id + "Person Name: "+ per.name+ "Person Job:" + per.job );
			
		}
		
//		Object o1 = new Object();
	}
}
