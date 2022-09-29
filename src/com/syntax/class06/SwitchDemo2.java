package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// matching cases must be of same data type as a variable

		
		char choice='Y';
		String answer;
		
		switch(choice) {
		
		case 'Y':
			answer="Yes";
			break;
		case 'N':
			answer="No";
			break;
		case 'M':
			answer="Maybe";
			break;
		default:
			answer="Unknown";
			break;
		}
		System.out.println(answer);
		
		
		/*LIMITATION of Switch case
		 * 
		 * switch case cannot use logical operators
		 * 
		 * cannot use relational operators
		 * 
		 * CANNOT work with boolean values
		 * 
		 * CANNOT work with float/double and long 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		
		
		
		
		
	}

}
