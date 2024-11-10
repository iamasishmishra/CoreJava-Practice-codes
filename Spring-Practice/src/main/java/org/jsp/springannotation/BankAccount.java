package org.jsp.springannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BankAccount {

	@Value(value = "ABC")
	private String name;
	private long phone;
	private double balance;

	public BankAccount(@Value(value ="7673")long balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	@Value(value = "9876543210")
	public void setPhone(long phone) {
		this.phone = phone;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", phone=" + phone + ", balance=" + balance + "]";
	}
}
