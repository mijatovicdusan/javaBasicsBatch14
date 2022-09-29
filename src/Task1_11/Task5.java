package Task1_11;

public class Task5 {

	public static void main(String[] args) {
		//write java program that to check if given number is prime or not
		
		
		 int num = 9;
	        boolean isPrime=true;
	        if (num > 1) {

	            for(int i=2;i<num;i++) {
	                if(num%i==0) {
	                    isPrime=false;
	                    break;
	                }
	            }
	        }else {
	            isPrime=false;
	        }

	        if(isPrime) {
	            System.out.println(num+" is Prime");
	        }else {

	            System.out.println(num+" is not Prime");
		
		
		
		
		
		
		
		
		
		
		
	        } 
		
		
		
	}

}
