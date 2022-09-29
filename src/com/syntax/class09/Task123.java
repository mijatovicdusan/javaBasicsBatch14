package com.syntax.class09;

public class Task123 {

	public static void main(String[] args) {
		// Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).

		
		char[] grades=new char[6];
		
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';

		System.out.println(grades[3]);
		
		char[] grades1= {'A','B' ,'C', 'D','E','F'};
		
		System.out.println(grades1[5]);
		
		//Create an array of names and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).

		String[] names=new String [3];
		
		names[0]="Dusan";
		names[1]="Goca";
		names[2]="Smiljana";
		
		System.out.println(names[2]);
		
		String[] names1= {"krava","konj","koza"};
		
		System.out.println(names1[0]);
		
		
		//Create an array of words: Java, Saturday, day, coding, is. 
		//Print the following sentence using elements of array: “Saturday is Java coding Day”.
		
		String[] words=new String[4];
		
		words[0]="java";
		words[1]="saturday";
		words[2]="day";
		words[3]="coding";
		
		System.out.println(words[2]);

		String[] words1= {"java","saturday","day","coding"};
		
		System.out.println(words1[1]+" is "+words1[0]+" "+words1[3]+" "+words1[2]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
