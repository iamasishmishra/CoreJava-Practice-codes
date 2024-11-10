package org.jsp.abstraction;

import java.util.Deque;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

abstract class Demo6{
	int x=60;
	public void test() {
		System.out.println("test method is running...");
	}
	
	abstract public void disp();
}

class Sample4 extends Demo6{
	@Override
	public void disp() {
		System.out.println("running disp method in sub class");
	}
}

public class Exmple1 {
	public static void main(String[] args) {
		Sample4 s4 = new Sample4();
		System.out.println(s4.x);
		s4.test();s4.disp();
//		LinkedHashSet<E>
//		LinkedHashMap<K, V>
//		TreeSet<E>
//		Hashtable<K, V>
//		PriorityQueue<E>
//		Deque<E>
//		Iterator<E>
		Iterable<T>
	}
}
