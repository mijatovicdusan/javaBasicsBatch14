package com.syntax.class13;

import java.util.Arrays;

public class StringDemoSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Today is Sunday";
		String day=str.substring(9);
		
		System.out.println(str.substring(6,8));

		System.out.println(day);
		
		char c=str.charAt(4);
		System.out.println(c);
		
		char[] charArr=str.toCharArray();
		
		System.out.println(Arrays.toString(charArr));
		
		
		int index=str.indexOf("a");
		System.out.println(index);
		
		
		
		
		
	}

}
