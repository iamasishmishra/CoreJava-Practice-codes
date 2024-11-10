package org.jsp.collection.Set;

import java.util.HashSet;

public class SetPractice {
	public static void main(String[] args) {
		HashSet h1 = new HashSet();
		
		System.out.println("No of elements in set: "+ h1.size());
		System.out.println("Is the hash set is empty: "+ h1.isEmpty());
		System.out.println("Adding elements into set: ");
		h1.add(100);
		h1.add(300);
		h1.add(40);
		h1.add(2);
		h1.add(2);
		h1.add(true);
		h1.add(null);
		
		System.out.println("No of elements in set: "+ h1.size());
		System.out.println("Is the hash set is empty: "+ h1.isEmpty());
		System.out.println("Set elements: "+ h1);
		
		for(Object s1: h1) {
			System.out.println(s1);
		}
	}
}
