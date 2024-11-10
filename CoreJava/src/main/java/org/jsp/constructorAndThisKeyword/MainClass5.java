package org.jsp.constructorAndThisKeyword;

class Table {
	int x;
	
	Table(int x){
		this.x=x;
	}

	void disp() {
		System.out.println("Disp running...");
	}
}

class Room {
	int x = 50;
	Table t1;
	
	Room(Table t1){
		this.t1=t1;
	}
	
	
	void accessDisp() {
		t1.disp();
	}
	
	void play() {
		System.out.println("Play running...");
	}
}

public class MainClass5 {
	public static void main(String[] args) {
		Table t1 = new Table(20);
		
		Room r1 = new Room(t1);
		r1.accessDisp();
	}
}
