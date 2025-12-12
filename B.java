package com.Dec_10;

public class B extends A{
public void showB() {
	System.out.println("Method B....");
	
	
}
public static void main(String[] args) {
	B b=new B();
	b.showA();
	b.showB();
}
}
