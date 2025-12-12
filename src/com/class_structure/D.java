package com.class_structure;

public class D extends C{
	public void showD() {
		System.out.println("method D...");
	}
	public static void main(String[] args) {
		System.out.println("D class");
		D d=new D();
		d.showA();
		d.showC();
		d.showD();
		System.out.println("B class");
		B b =new B();
		b.showA();
		b.showB();
	}

}
