package com.syntax.class12;

public class StringDemoSubstring {
	public static void main(String[]args) {
		
		
		String str="I'm always confused, I was kidding";
		
		System.out.println(str.indexOf("a"));
		
		System.out.println(str.indexOf("s"));
	
		System.out.println(str.indexOf(" "));

		System.out.println(str.indexOf("I"));

		
		System.out.println(str.substring(1));
		
		
		//substring() gives you smaller string from a String,
		//we can start the starting part to this method and it will return us the subString from that index
		
		
		
		System.out.println(str.substring(5,15));// where it starts and where it ends
		
		
	int num=123456789;
	
	String numStr=String.valueOf(num);
	
	System.out.println(numStr);
	
	num=Integer.parseInt(numStr);
	
	System.out.println(num);

		
		
		
		
		
		
	}

}
