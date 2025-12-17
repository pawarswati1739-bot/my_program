package com.polymerphism;

public class Calculcter {
	void addition (int a, int b) {
	System.out.println("a+b =" + (a+b));
}
void addition(int a, int b, int c) {
	System.out.println("a+b =" + (a+b+c));

}
public static void main(String[] args) {
	Calculcter c =new Calculcter();
	c.addition(23, 560);
	c.addition(34, 70, 87);
}


}

