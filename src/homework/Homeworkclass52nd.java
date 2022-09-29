package homework;

import java.util.Scanner;

public class Homeworkclass52nd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 2. Write a program for user to enter his/hers birth month. Based on the month
		 * define the season. Example: if user is born in March, April, May → season
		 * =”Spring” if user is born in June, July, August → season =”Summer” etc …
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your birth month");

		String month = scanner.nextLine();

		if (month.equals("January") || month.equals("Febryary") || month.equals("December")
				|| month.equals("November")) {
			System.out.println("Winter");
		}

		else if (month.equals("March") || month.equals("April") || month.equals("May")) {

			System.out.println("Spring");
		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			System.out.println("Summer");
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			System.out.println("Autumn");
		}

	}

}
