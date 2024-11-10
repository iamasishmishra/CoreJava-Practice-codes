package org.jsp.collection.List;
import java.util.ArrayList;

public class ArrayListPractice3 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(30);
		arr.add(500);
		arr.add(21);
		arr.add(29);
		arr.add(85);
		
		System.out.println("List elements: ");
		arr.add(1,300);
		for(Object l1: arr) {
			System.out.println(l1);
		}
		System.out.println(arr);
		arr.remove(3);
		System.out.println(arr);
		
	}
}
