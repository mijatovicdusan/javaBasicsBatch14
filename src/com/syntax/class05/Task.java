package com.syntax.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TASK 1
		/*
		 * 1. Prompt the user to enter person heights in inches. Person should be
		 * classified as one of the following: • short (under 60 inch) • medium(between
		 * 60 -72 inch) • tall (over 72 inch)
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("What is your height?");

		double height = scanner.nextDouble();

		if (height < 60) {

			System.out.println("You are short");
		} else if (height >= 60 && (height <= 72)) {

			System.out.println("You are medium height");
		} else if (height > 72) {

			System.out.println("You are tall");
		}

		// TASK2

		/*
		 * 2. Write a program that will print whether it is a weekend or weekday. If any
		 * day from 1-5 → output “It is a weekday”, any day from 6-7 → output “It is a
		 * weekend”, any other day → output “Invalid day”
		 */

		System.out.println("What is the day today");
		String day = scanner.next();

		if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")
				|| day.equals("Friday")) {

			System.out.println("It is a weekday");

		}

		else if (day.equals("Saturday") || day.equals("Sunday")) {

			System.out.println("It is a weekend");
		}

		else {
			System.out.println("Invalid day");
		}

		/*
		 * 3. Ask user to enter a number and then define if number is small, medium or
		 * large Small number is value between 1 and 10 Medium number is value between
		 * 11 and 100 Large number is value between 101 and 1000
		 */

		System.out.println("Give me number");

		double number = scanner.nextDouble();

		if (number >= 1 && (number <= 10)) {

			System.out.println("It is small number");
		}

		else if (number >= 11 && (number <= 100)) {

			System.out.println("It is medium number");
		}

		else if (number >= 101 && (number <= 1000)) {

			System.out.println("It is large number");
		}

	}

}
