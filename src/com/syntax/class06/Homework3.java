package com.syntax.class06;
import java.util.Scanner;
public class Homework3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1 = scanner.nextInt();
		System.out.println("Please enter second number");
		int num2 = scanner.nextInt();
		System.out.println("Please enter operator(+,-,* or/");
		char operator = scanner.next().charAt(0);
		int result = 1;
		if (operator == '+') {
			result = num1 + num2;
			System.out.println(result);
		} else if (operator == '-') {
			result = num1 - num2;
			System.out.println(result);
		} else if (operator == '/') {
			result = num1 / num2;
			System.out.println(result);
		} else if (operator == '*') {
			result = num1 * num2;
			System.out.println(result);
		} else {
			System.out.println("invalid");}
switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("invalid");
			break;}
System.out.println(result);}}
