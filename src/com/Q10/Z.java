package com.Q10;

public class Z extends Y{
int z=30;
void display() {
	System.out.println("X ="+x);
	System.out.println("Y ="+y);

	System.out.println("Z ="+z);

}
public static void main(String[] args) {
	Z z=new Z();
	z.display();
}
}
