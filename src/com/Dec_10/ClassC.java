package com.Dec_10;

public class ClassC extends ClassB {
	public void showC() {
		System.out.println("Show method C .....");
	}
	public static void main(String[] args) {
		ClassC c =new ClassC();
		c.showA();
		c.showB();
		c.showC();
		
	}
}

