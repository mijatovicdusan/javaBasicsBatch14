package Task1_11;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Using Scanner ask user about the size of the array and then create array of integer values. After the array is created,
		//fill the array with numbers from user and then
		//calculate sum of all stored elements in that array

		
	Scanner scanner=new Scanner(System.in);	
	
	System.out.println("Please enter the size of the array");

	int size=scanner.nextInt();
	
	int [] arr=new int[size];//creates arrays from the numbers taken from user
		
	
	for(int i=0; i<size; i++) {
		
		System.out.println("Please enter number");
		arr[i]=scanner.nextInt();
	}
		System.out.println(Arrays.toString(arr));
		
		int sum=0;
		for (int num:arr) {
			sum+=num;
		}
		
		System.out.println("Sum of all the numbers from the array is "+sum);
		
		
		
		
		
		
		
	}

}
