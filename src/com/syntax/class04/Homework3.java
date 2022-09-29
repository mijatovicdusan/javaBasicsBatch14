package com.syntax.class04;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * You are DMV representative and you need to ask customer their age. If they
		 * are 18 and older you will issue a driver licence to them, otherwise you will
		 * offer them to get a learners permit.
		 */

		Scanner Scanner = new Scanner(System.in);

		System.out.println("What is your age");

		int age = Scanner.nextInt();

		if (age >= 18) {

			System.out.println("Congratulation, you can drive");

		} else {

			System.out.println("You need learners permit");
		}
/*
Create a Java program that will ask user to input city and temperature.
 Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ”
Create a Java program that will ask if user has a credit card or not. 
If you user does not have a credit card then offer them. 
If they do have one ask what is balance on the card? 
If balance of the card is larger than 1000, tell them to pay off immediately, otherwise you can tell them that they can spend more.
Write a program to ask user to enter numbers of worked years and annual salary. 
If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not. 
Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.*/
	
	
	
	System.out.println("What is your city?");
	
	String city=Scanner.next();

	
	System.out.println("What is current temperature in your city in Fahrenheit?");
	
	double tempF=Scanner.nextDouble();
	
	double tempC=(tempF-32)*0.5556;
	
	System.out.println("The temperature in "+city+" is "+tempC);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
