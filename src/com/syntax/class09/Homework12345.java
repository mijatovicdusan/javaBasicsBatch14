package com.syntax.class09;

public class Homework12345 {

	public static void main(String[] args) {
//1.Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.

		String[] cars = new String[6];

		cars[0] = "bmw";
		cars[1] = "benz";
		cars[2] = "audi";
		cars[3] = "porche";
		cars[4] = "lincoln";
		cars[5] = "acura";

		for (int i = 0; i < cars.length; i++) {

			System.out.print(cars[i] + " ");
		}

		System.out.println("________________________________________________________________________");

		for (String make : cars) {

			System.out.print(make + " ");
		}
System.out.println();
//2. Create an array of animals and store 5 elements into it. 
	//Using 2 different loops print all elements from the array.
		
		
		String[] animal= {"lion","dog","cat","fish","snake"};
		
		for(int i=0; i<animal.length; i++) {
			
			System.out.print(animal[i]+" ");
		}
		System.out.println();

		for(String type:animal) {
			
			System.out.print(type+" ");
		}
		
		
		System.out.println();
		

//3. Create an array on integers and calculate the sum of all elements in an array
		

	int[] num= {1, 55, 69, 78, 89, 31};
	int sum=0;
	
	for (int i=0; i<num.length; i++) {
		
		sum+=num[i];
		}
		
		System.out.println(sum);
		
		
		System.out.println();
		

//4. From an array of integer elements find the largest number.
		
		
		int[] number= {1,2,3369,7,6,99,15,7777,};
		
		
		int largest=0;
		
		for(int i=0; i<number.length; i++) {
			
			if(number[i]>largest) {
				largest=number[i];
			}
			
		}
		System.out.println(largest);
		
		System.out.println();

//5. Create an array to store char values and then print those in reverse order

		char[] num5= {'1','2','3','4','5'};
		
		
		for (int i=num5.length-1; i>=0; i-- ) {
			
			System.out.print(num5[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
