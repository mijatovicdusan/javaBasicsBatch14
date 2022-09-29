package practice;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter the size of an array");
		Scanner scan= new Scanner(System.in);
		
		int size=scan.nextInt();
		
		int [] array = new int[size];
		int sum=0;
		
		System.out.println("Please enter elements one by one");
		
		for(int i=0; i<size; i++) {
			array[i]=scan.nextInt();
			sum+=array[i];	
			
		}
		
		System.out.println("Sum of the elements is "+ sum);
	}

}
