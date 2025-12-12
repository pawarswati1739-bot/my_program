package com.Dec_10;

public class Child_2 extends Parent {
public void salary() {
	System.out.println("4.5LPA");
}
public static void main(String[] args) {
	Child_2 c2= new Child_2();
	c2.salary();
	c2.parent();
	Child_1 c1 =new Child_1();
	c1.name();
	c1.parent();
}
}
