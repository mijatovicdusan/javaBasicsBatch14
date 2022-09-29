package com.syntax.class03;

public class IfElse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isHungry = false;

		if (isHungry) {
			System.out.println("lets eat something yummy");
		}

		if (3 > 2)
			System.out.println("there is a true statement inside paranthesis");

		double myBankBalance = 2000;
		double theAmountThatIWantToTransfer = 250;

		if (myBankBalance > theAmountThatIWantToTransfer)

			System.out.println("Funds transfered succesfully");

		else
			System.out.println("Please try again not enough balance");

	}
}
