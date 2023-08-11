package AssigmentJava;

public class twenty25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//WAP to reverse an array of integer values.
	
		        int[] myArray = {5, 10, 15, 20, 25};
		        
		        System.out.println("Original Array:");
		        printArray(myArray);
		        
		        reverseArray(myArray);
		        
		        System.out.println("Reversed Array:");
		        printArray(myArray);
		    }
		    
		    public static void reverseArray(int[] arr) {
		        int start = 0;
		        int end = arr.length - 1;
		        
		        while (start < end) {
		            int temp = arr[start];
		            arr[start] = arr[end];
		            arr[end] = temp;
		            
		            start++;
		            end--;
		        }
		    }
		    
		    public static void printArray(int[] arr) {
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		        System.out.println();
		    }
		

	}


