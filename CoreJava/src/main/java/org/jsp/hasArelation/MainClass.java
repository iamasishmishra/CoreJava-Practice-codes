package org.jsp.hasArelation;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Account{
	long accountNo;
	double balance;
	String branch;
	
	public void deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println("Now the balance is: "+ balance);
		}
		else {
			System.out.println("Invalid amount");
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount<balance) {
			balance = balance-amount;
			System.out.println("Now the balance is : "+ balance);
		}else {
			System.out.println("Insufficient balance or Invalid balance..");
		}
	}
}

@AllArgsConstructor
class Constomer{
	String name;
	long phone;
	Account a1;
	
	public void depositToAccount(double amount) {
		a1.deposit(amount);
		System.out.println("Constumer details: "+ name);
	}
	
	public void withdrawFromAccount(double amount) {
		a1.withdraw(amount);
		System.out.println("Constumer details: "+ name);
	}
}



public class MainClass {
	public static void main(String[] args) {
		
		Account a1 = new Account(234l,100.0, "BTM");
		a1.deposit(300);
		Constomer c1 = new Constomer("Nithin", 78787657l, a1);
		c1.withdrawFromAccount(100);
	}
}
