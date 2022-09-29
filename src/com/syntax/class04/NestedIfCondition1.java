package com.syntax.class04;

public class NestedIfCondition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int time=9;
		String day="Monday";
		/*
		 * it is called outer if-condition if it is true then only inner conditions will be checked.
		 * if it is false nothing from inner in-conditions will be executed.It;s like the main door
		 * if main door is closed we can't enter building
		 * */
		if(day.equals("Monday")) {//as String is non primitive we can not use== sign, we have to use .equals method
			
			
			
		//inner if-conditions	
			
			if(time>7) {
				
				System.out.println("Lets go to the office");
			}
		
		if(time<6) {
			
			System.out.println("Lets sleep more");
		}
		
		
		
		
		
		
		
		
		
		
		}
		
	}

}
