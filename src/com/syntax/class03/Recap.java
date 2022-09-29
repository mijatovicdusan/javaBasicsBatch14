package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generate
		/*
		 * String caoncatenation helps us combine  a String with any primitive data type together
		 * 
		 */
		String firstName="Mina";
		String lastName="Henen";
		
		
		String fullName=firstName+" "+lastName;
		
		
		System.out.println(fullName);
		
		
		
		int houseNo=10;
		int apartmentNo=5;
		String streetName="That street";
		String city="New York";
		String country="USA";
		String fullAddress=houseNo+" "+apartmentNo+" "+streetName+" "+city+" "+country;
		
		System.out.println(fullAddress);
		
		String incompleteAddress=houseNo+city;
		
		
		
		String step1="if we subtract 10 from 5 we get="+10;//result in a String
		// it's not defined,
		//Java does not understand what to do when we
		 //ask it to subtract a String from number
		
		
		System.out.println("if we subtract 10 from 5 we get = "+(10-5));
	
		
		
		
		
		
		
		
		
		
	}

}
