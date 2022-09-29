package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int[] array=new int[4];// array is just a name, it could be arr
	
		
		array[0]=10;               // storing elements inside arrays
		array[1]=20;
		array[2]=30;
		array[3]=40;

		
		//accessing elements from the array
		
		System.out.println(array[3]);
		
		System.out.println(array[1]+array[3]);
		
		
		
		
		//create array and store names
		
		
		String[] name=new String[5];
		
		name[0]="Shah";
		name[1]="Vera";
		name[2]="Roman";
		name[3]="Dusan";
		name[4]="Branko";
		
		
		
		System.out.println("Hello "+name[3]);
		
		
		
		
	}

}
