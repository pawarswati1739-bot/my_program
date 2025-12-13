package com.scanner;

import java.util.Scanner;

//print a sentence using nextLine()
public class Sentence {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Write a Sentence");
	String sentence = sc.nextLine();
	System.out.println(sentence);
}
}
