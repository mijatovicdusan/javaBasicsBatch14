package com.syntax.class10;

public class TwoDArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String [][] countries= {
			
			{"usa","canada"},//1st array with index 0
			{"peru","brasil","colombia","ecuador"},//2nd arrray with index 1
			{"ethiopia","egypt","kenya"},
			{"serbia","germany","turkey","moldova","croatia"},
			{"russia","china","japan","korea"}
	};
		
		System.out.println(countries.length);//5 total number of arrays or rows
		
		
		int num=countries[0].length;
		
		System.out.println("Number of elements from the 1st array = "+num);
		
		
		int num1=countries[1].length;
		
		System.out.println("Number of elements from the 1st array = "+num1);
		
		
		System.out.println("Getting all values from 2d array ");
		
		
		for (int r=0; r<countries.length; r++) {// loops over rows
			
			
			for (int c=0; c<countries[r].length; c++ ) {
				
				System.out.print(countries[r][c]+" ");
				
				
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
	}

}
