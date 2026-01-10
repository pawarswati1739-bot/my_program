package com.jbk1;
//Q5 ....Exception
public class FinallyException {
	public static void main(String[] args) {
        try {
            System.out.println("Try block");
        } finally {
            int a = 10 / 0;   
        }
    }
}
