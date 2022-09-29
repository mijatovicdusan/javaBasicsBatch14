package com.syntax.class12;

public class StringDemoLength {

	public static void main(String[] args) {
		
		String str=new String("Java");//proper way of creating an object
		
		String name="Java is programming language";// only works for String  and Wrapper classes
		//simpler and shorter way provided by Java Creators to make out life easier
		System.out.println(str.length());//counts number of characters in a string including spaces
		System.out.println(name.length());
		
		if(name.length()>15) {
			
			System.out.println("name cannot be more that 15 characters");
		}
	}

}
