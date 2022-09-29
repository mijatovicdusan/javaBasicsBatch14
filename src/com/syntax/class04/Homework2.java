package com.syntax.class04;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		/*
		 * Create a Java program and store values of mortgage rate and mortgage price.
		 * First, program should check if rate is higher than 4.5 user will not buy a
		 * house, otherwise user will consider buying. Once user decides to buy a house,
		 * if price of the house is larger than 200000 than user will take a loan,
		 * otherwise user will pay cash
		 */

		Scanner Scanner = new Scanner(System.in);

		System.out.println("What is your rate?");

		double rate = Scanner.nextDouble();

		if (rate > 4.5) {

			System.out.println("You can't buy a house");

		}

		else {

			System.out.println("You are approved for buying a house, what is the price of the house");

			double price = Scanner.nextDouble();

			if (price > 200000) {

				System.out.println("You need to take loan");
			}

			else {

				System.out.println("You can pay in cash");
			}
		}

	}
}