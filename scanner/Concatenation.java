package com.scanner;

import java.util.Scanner;

public class Concatenation {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write a sentence sen_1 : ");
        String sen_1 = sc.nextLine();
        System.out.println("writ a sentence sen_2 :");
        String sen_2 = sc.nextLine();
        System.out.println(sen_1 + sen_2);
    }

}
