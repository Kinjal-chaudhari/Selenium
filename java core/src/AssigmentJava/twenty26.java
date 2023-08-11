package AssigmentJava;

public class twenty26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//WAP to Copy one array into another
		
		
		        int[] sourceArray = {5, 10, 15, 20, 25};
		        int[] destinationArray = new int[sourceArray.length];
		        
		        // Copy the elements
		        copyArray(sourceArray, destinationArray);
		        
		        // Display the copied array
		        System.out.println("Source Array:");
		        printArray(sourceArray);
		        
		        System.out.println("Destination Array (Copied):");
		        printArray(destinationArray);
		    }
		    
		    public static void copyArray(int[] source, int[] destination) {
		        for (int i = 0; i < source.length; i++) {
		            destination[i] = source[i];
		        }
		    }
		    
		    public static void printArray(int[] arr) {
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		        System.out.println();
		    }
		

	}


