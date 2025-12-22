package com.abstraction;
//20 Q HW
public class Child implements Father ,Mother {

	@Override
	public void coocking() {
		System.out.println("Veg and Non-veg Dishes");
		
	}

	@Override
	public void surName() {
		System.out.println("Pawar...!");
		
	}
	public static void main(String[] args) {
		Child c ;
		c=new Child();
		c.surName();
		c.coocking();
		
		Child ch=new Child();
		ch.surName();
		ch.coocking();
	}

}
