package com.syntax.class06;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*1. Allow user to enter grade (A, B, or C etc...) and then provide explanation: 
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
		 *  At the end your program should print which grade was entered by a user with explanation.*/
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your grade");
		String grade=scanner.nextLine();
		switch(grade) {
		case "A":
			grade="Excellent";
			break;
		case "B":
			grade="Good";
			break;
		case "C":
			grade="Average";
			break;
		case"D":
			grade="Bad";
			break;
			default:
			grade="Not Acceptable";
			break;}
		System.out.println(grade);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
