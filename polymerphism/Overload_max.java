package com.polymerphism;

public class Overload_max {


int max(int a, int b) {
    return (a > b) ? a : b;
}

int max(int a, int b, int c) {
    return (a > b && a > c) ? a : (b > c ? b : c);
}

public static void main(String[] args) {
	Overload_max  o =new Overload_max();
    System.out.println(o.max(10, 20));
    System.out.println(o.max(10, 20, 30));
}
}

