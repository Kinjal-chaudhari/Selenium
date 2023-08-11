package AssigmentJava;

public class Twenty1 {

	
		// TODO Auto-generated method stub
//WAP to find the second largest element in an array
		
		    public static void main(String[] args) {
		        int[] arr = { 5, 8, 2, 15, 7, 10, 3 };

		        int secondLargest = findSecondLargest(arr);

		        if (secondLargest != Integer.MIN_VALUE) {
		            System.out.println("Second largest element: " + secondLargest);
		        } else {
		            System.out.println("No second largest element found.");
		        }
		    }

		    public static int findSecondLargest(int[] arr) {
		        int n = arr.length;

		        if (n < 2) {
		            return Integer.MIN_VALUE; // Not enough elements in the array
		        }

		        int largest = Integer.MIN_VALUE;
		        int secondLargest = Integer.MIN_VALUE;

		        for (int i = 0; i < n; i++) {
		            if (arr[i] > largest) {
		                secondLargest = largest;
		                largest = arr[i];
		            } else if (arr[i] > secondLargest && arr[i] != largest) {
		                secondLargest = arr[i];
		            }
		        }

		        return secondLargest;
		    }
		}

	


