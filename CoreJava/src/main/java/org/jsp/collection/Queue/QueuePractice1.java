package org.jsp.collection.Queue;

import java.util.PriorityQueue;

public class QueuePractice1 {
	public static void main(String[] args) {
		PriorityQueue p1 = new PriorityQueue();
		
		
		System.out.println("Adding elements into queue: ");
		p1.add(12);
		p1.add(200);
		p1.add(18);
		p1.add(9);
		System.out.println("Is queue empty: "+ p1.isEmpty());
		System.out.println("Queue size : "+ p1.size());
		System.out.println(p1);
		System.out.println(p1.poll());
		System.out.println(p1);
		System.out.println(p1.peek());
		System.out.println(p1);
		
		
	}

}
