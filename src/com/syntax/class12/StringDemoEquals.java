package com.syntax.class12;

public class StringDemoEquals {

	public static void main(String[] args) {

		String str="Shah";
		
		String str2="Shah";
		
		String str3=new String ("Shah");


			if(str.equalsIgnoreCase("shah")) {//equalsIgnoreCase checks if 2 Strings are exactly the same but ignores upper or lower cases
				
				System.out.println("I found it with equalsIgnoreCase");
			}
		
		if(str.equals(str3)) {// equals checks if 2 Strings are exactly the same with exact same cases
			
			
			System.out.println("I found it");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
