package com.thread;

public class ThreadClass extends Thread{
		    public void run() {
	        try {
	            //  sleep()
	            Thread.sleep(500);
	            System.out.println("Running Thread: " + getName());
	        } catch (InterruptedException e) {
	            System.out.println(e);
	        }
	    }

	    // 1. setName()
	    void changeName(String name) {
	        setName(name);
	    }

	    // 2. getName()
	    void showName() {
	        System.out.println("Thread Name: " + getName());
	    }

	    // 3. setPriority()
	    void changePriority(int p) {
	        setPriority(p);
	    }

	    // 4. getPriority()
	    void showPriority() {
	        System.out.println("Thread Priority: " + getPriority());
	    }

	    // 5. isAlive()
	    void checkAlive() {
	        System.out.println("Is thread alive? " + isAlive());
	    }
	

}
