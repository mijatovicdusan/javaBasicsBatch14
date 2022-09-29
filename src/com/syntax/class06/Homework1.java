package com.syntax.class06;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * HOMEWORK: 1. Ask user to enter their country and capture it. Once values are
		 * captured print which language user speaks.
		 */

		Scanner scan = new Scanner(System.in);
System.out.println("Enter your country");
String country = scan.nextLine();
		String language;
		switch (country) {
		case "Serbia":
			language = "Serbian";
			break;
		case "USA":
			language = "English";
			break;
		case "Hungary":
			language = "Hungarian";
			break;
		default:
			language = "Unknown";
			break;}
		System.out.println(language);

	}

}
