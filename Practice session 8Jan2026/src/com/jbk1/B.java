package com.jbk1;
//Q7 .... Multithreading
//using Runable interface

public class B implements Runnable{
	public void run() {
        System.out.println("Runnable thread ");
    }

    public static void main(String[] args) {
        B b =new B();
        Thread t = new Thread(b);
        t.start();
    }
}
