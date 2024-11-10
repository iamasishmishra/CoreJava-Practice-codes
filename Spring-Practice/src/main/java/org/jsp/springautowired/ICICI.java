package org.jsp.springautowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ICICI implements BankAccount {

	@Value(value = "55000")
	private double balance;

	public double getBalance() {
		return balance;
	}
}
