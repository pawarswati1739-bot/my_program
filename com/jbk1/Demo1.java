package com.jbk1;
//Q8....Multithreading
public class Demo1 extends Thread {
	public void run() {
        System.out.println("Excute the Thread");
    }

    public static void main(String[] args) {
        Demo1 d = new Demo1();
    // Normal method call(by using obj creation calling the run() method)
        d.run(); 
     // Creates new thread with built in method
        d.start();  
    }
}
