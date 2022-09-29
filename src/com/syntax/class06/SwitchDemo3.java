package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*ask user where is he from
		 * based on country define favorite food
		 * 
	
		 * 
		 * */
		
		Scanner in=new Scanner(System.in);
		
		
		System.out.println("Where are you from");
		
		String country=in.nextLine();
		
		String favoritefood;
		
		switch(country) {
		
				case"usa":
					favoritefood="burgers and fries";
					break;
				case"kazahstan":
					favoritefood="beshparmak";
					break;
				case "turkey":
					favoritefood="kebab";
					break;
				case"venezuela":
					favoritefood="arepa";
					break;
				case"india":
					favoritefood="chicken";
					break;
				case"yemen":
					favoritefood="mandi";
					break;
				case"afganistan":
					favoritefood="qaboli";
					break;
		
				default:
					favoritefood="unknown";
					break;
				
		
		
		}
		
		System.out.println("You are from "+country+" and your favorite food is "+favoritefood);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
