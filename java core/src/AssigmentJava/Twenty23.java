package AssigmentJava;

public class Twenty23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//WAP to calculate the average value of array elements
		
		
		        int[] myArray = {5, 10, 15, 20, 25};
		        double averageValue = calculateAverage(myArray);
		        System.out.println("The average value of the array is: " + averageValue);
		    }

		    public static double calculateAverage(int[] arr) {
		        int total = 0;
		        for (int num : arr) {
		            total += num;
		        }
		        return (double) total / arr.length;
		    }
		

	}


