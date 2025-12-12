package com.De_6c;

public class BankAcco {
private double balance ;
public void deposit (double amt) {
	balance +=amt;
}
public void withdrow (double amt) {
	if(amt<=balance) {
		balance -=amt;
	}
	else {
		System.out.println("Insufficient balance...!");
	}
	
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
}
