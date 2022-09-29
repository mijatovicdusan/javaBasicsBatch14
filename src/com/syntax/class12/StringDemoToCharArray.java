package com.syntax.class12;

public class StringDemoToCharArray {

	public static void main(String[] args) {

		
		String str="I love Java programming";

		char[] charArray=str.toCharArray();// toCharArray will convert String to an array of chars
		
		System.out.println(charArray[5]);
		
		
		int counter=0;
		
		for(char c:charArray) {
			if(c=='a') {
			counter++;
		}
		}
		System.out.println("letter a has appeared "+counter+ " times");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
