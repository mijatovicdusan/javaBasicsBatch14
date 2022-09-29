package com.syntax.class09;

public class ForEachLoopAdvancedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//only when we deal with arrays or collections Java gives us additional loop we can use,
		//ADVANCED FOR LOOP or  FOR LOOP 
		
		
		String[] icecream= {"vanilla","chocolate","anything","mango","koza"};

		
		for(String flavor:icecream) {
			
			
			System.out.println(flavor);
		}
		
		System.out.println("_____________________________________________________");
		
		char[] letters= {'a','b','c','d','f'};

		for(char letter:letters) {
			
			System.out.println(letter);
		}
		
		
		int[] numbers= {12,56,345,1,0,9};// get all elements using regular for loop
		
		
		for (int i=0; i<numbers.length; i++) {
			
			System.out.print(numbers[i]+" ");
		}
		
		System.out.println("_______________________________________________________________");
		
		// this loop only run from start to the end
		
		for(int number:numbers) {
			
			
			System.out.print(number+" ");
		}
		
		
		
		
		
	}

}
