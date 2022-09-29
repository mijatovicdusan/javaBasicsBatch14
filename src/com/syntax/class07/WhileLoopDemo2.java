package com.syntax.class07;

public class WhileLoopDemo2 {

	public static void main(String[] args) {

		// print all numbers 1-10

		int num = 1;

		while (num <= 10) {

			System.out.print(num + " ");
			num++;
		}
System.out.println("_____________________________________________________");

		// print numbers 10-25

		int a = 10;

		while (a <= 25) {

			System.out.print(a + " ");

			a++;
		}

		// print all numbers 50 to 20

		int w = 50;

		while (w <= 50 && w > 20) {

			w--;
			System.out.print(w + " ");
		}

		// print all even numbers 1-20

		int c = 2;

		while (c <= 20) {

			System.out.println(c + " ");
			c += 2;

			// OR

			int i = 1;

			while (i <= 20) {
				if (i % 2 == 0) {

					System.out.print(i + " ");
				}
				i++;
			}

		}

	}

}
