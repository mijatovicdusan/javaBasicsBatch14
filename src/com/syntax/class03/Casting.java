package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * type casting =>  type = data type casting = converting
		 * converting one data type to another
		 */
		
		byte box1=127; // smallest box 8 bits
		short box2=3333; // double the size of box1 in terms of bits, this one is 16 bits
		int box3=6465455;// 32 bits box, most commonly used
		long box4=996411683;// large box, 64 bits
		float box5=99996622;// larger box,
		double box6=989898989;//largest,
		
		int number=(int)15.2;// we can't store decimal nimber in a box of type int
		
		System.out.println(number);
		
		byte smallerBox=(byte)box2;
		
		
		System.out.println(smallerBox);
		
		
		short biggerBox=box1;
		
		
		
		long box7=box1;// we can do this because box7 is bigger than box1 so box1 can fit in box7
		
		float box8=(float)box6;// box6 is larger than box8 so we need type casting(converting) to assign the value
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
