package com.abstraction;

public class Gpay implements UPI {

	@Override
	public void makePayment() {
		System.out.println("Payment through Gpay");
		System.out.println("Payment  Done");
	}

}
