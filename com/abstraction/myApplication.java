package com.abstraction;
//payment
public class myApplication {
public static void main(String[] args) {
	Gpay g;
	g= new Gpay();
	g.makePayment();
	
	System.out.println("   ");
	
	Phonepe p;
	p=new Phonepe();
	p.makePayment();
	
	System.out.println(" ");
	
	Paytem py;
	py =new Paytem();
	py.makePayment();
}
}
