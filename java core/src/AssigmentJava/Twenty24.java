package AssigmentJava;

public class Twenty24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//WAP to find the index of an array element.
		
		        int[] myArray = {5, 10, 15, 20, 25};
		        int target = 15;
		        
		        int index = findIndex(myArray, target);
		        
		        if (index != -1) {
		            System.out.println("The element " + target + " is found at index " + index);
		        } else {
		            System.out.println("The element " + target + " is not found in the array.");
		        }
		    }
		    
		    public static int findIndex(int[] arr, int target) {
		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] == target) {
		                return i;
		            }
		        }
		        return -1; 
		    }
		

		
	}


