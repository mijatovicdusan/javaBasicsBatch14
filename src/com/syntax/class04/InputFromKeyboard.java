package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Scanner is a class that helps us take the input from keyboard
		 * it contains many different smaller modules called methods that can help us take Strings,
		 * booleans, basically all types of data from keyboard*/

		
		// import java.util.Scanner;

		Scanner input=new Scanner(System.in);
		//a message will be displayed on the console to enter his/her name
		
		System.out.println("Please enter your name");
		//activates the java program to take input from the keyboard and store it inside name variable
		
		String name=input.next();
		//prints whatever name user enters on the keyboard on the console
		
		System.out.println("Hello "+name+" don't be confused");
		
		
		
		
		
		
		
		
		
		
		
	}

}
