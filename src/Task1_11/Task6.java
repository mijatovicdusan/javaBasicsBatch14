package Task1_11;

public class Task6 {

	public static void main(String[] args) {
	
	      // Write a Java Program to print the first 10 numbers of Fibonacci(add previous 2 numbers to create series) series
        // 0 1 1 2 3 5 8 13 21
        int previous=0;
        int currentNumber=1;
        int nextNum=0;
        System.out.println(previous);
        System.out.println(currentNumber);
        for(int i=0; i<8;i++) {
            nextNum=previous+currentNumber;
            System.out.println(nextNum);
            previous=currentNumber;
            currentNumber=nextNum;

		
        }	
		
		
	}

}
