package com.syntax.class12;

public class Homework1 {

	public static void main(String[] args) {
		// Create a String and if the String is not empty perform the following: 
		//if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.

		
	String str="Java is lovee";
	if(!str.isEmpty() && str.length()%2!=0&&str.length()>=3) {
		
		int middleIndex=str.length()/2;
		
		System.out.println(str.charAt(middleIndex));
	}
		
		
	
        /*
         * Create a String and print it in reverse order (Sunday → yadnuS).
         */
        String str2="Sunday";

        for(int i=str2.length()-1;i>=0;i--) {
            System.out.print(str2.charAt(i));
	
	
	
	
	
	
	
	
	
	
		
        }
		
	}

}
