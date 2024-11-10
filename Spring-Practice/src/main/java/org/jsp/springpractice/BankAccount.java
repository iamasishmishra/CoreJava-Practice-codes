package org.jsp.springpractice;

public class BankAccount {
	private String name;
	private double balance;
	
	public void display() {
		System.out.println("Account Holder name : " + name);
		System.out.println("Account balance : " + balance);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
