package datatype;

public class Newarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("static array");	
    int arr[][]={{1,2,3},{4,5,6},{5,6,7}};
    for(int row=0;row<=2;row++) {
    	for( int col=0;col<=2;col++) {
    		System.out.print(arr[row][col]+" ");
    		
    	}
    	System.out.println();
    }
   
	}

}
