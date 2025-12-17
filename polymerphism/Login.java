package com.polymerphism;

import java.util.Scanner;

public class Login {
	
	
	void login(String username) {
		
        System.out.println("Login with username: " + username);
    }

    void login(String username, String password) {
    	
        System.out.println("Login successful");
        
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        Login l = new Login();

        System.out.print("Enter username: ");
        String user = sc.next();

        System.out.print("Do you want to enter password? (yes/no): ");
        String choice = sc.next();

        if (choice.equalsIgnoreCase("yes")) {
        	
            System.err.print("Enter password: ");
            String pass = sc.next();
            l.login(user, pass);
        } 
        else {
            l.login(user);
        }
    }
}

