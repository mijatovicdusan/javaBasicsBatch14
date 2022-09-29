package homework;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program to check whether number is positive or negative. Interview
		 * Question Write a Java Program to check whether number is Even or Odd.
		 */

		// task 1

		int num = 0;

		if (num > 0) {
			System.out.println("Positive");
		} else if (num<0);{
			System.out.println("Negative");
		}
		 {
			System.out.println("Number is zero");
		}

		// taks 2

		int remainder = (int) num % 2;

		if (remainder == 0) {
			System.out.println("Even");
		}

		else {
			System.out.println("Odd");
		}

	}

}
