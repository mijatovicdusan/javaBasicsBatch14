package com.syntax.class04;

public class NestedIfCondition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double moneyInMyAccount = 100000;
		String season = "Spring";

		if (season.equals("Spring")) {

			if (moneyInMyAccount > 30000) {

				System.out.println("Lets do vacations");
			}

			else {
				System.out.println("I need to save more");
			}

		}

	}

}
