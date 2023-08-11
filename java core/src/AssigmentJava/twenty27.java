package AssigmentJava;

public class twenty27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WAP to compute the sum of the first 100 prime numbers.
		
		
		        int count = 0;
		        int number = 2; // Start with the first prime number
		        long sum = 0;

		        while (count < 100) {
		            if (isPrime(number)) {
		                sum += number;
		                count++;
		            }
		            number++;
		        }

		        System.out.println("Sum of the first 100 prime numbers: " + sum);
		    }

		    public static boolean isPrime(int num) {
		        if (num <= 1) {
		            return false;
		        }
		        for (int i = 2; i * i <= num; i++) {
		            if (num % i == 0) {
		                return false;
		            }
		        }
		        return true;
		    }
		

	}
	


