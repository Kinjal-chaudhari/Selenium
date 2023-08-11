package datatype;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("enter array size");
		int array[]=new int[size];
		/*System.out.println("enter array size");*/
		for(int index=0;index<array.length;index++) {
			System.out.print("enter element at array["+index+"] : ");
			
			  array[index]=sc.nextInt();
			
		}
	int sum = 0;
	for(int index=0;index<array.length;index++) {
		sum=sum+array[index];
	}
	
	 System.out.println("total of array is[+sum+]"+sum);
		
    System.out.println("number to search in array");
     int num=sc.nextInt();
     int counter=0;
     for( int index=0;index<array.length;index++) {
    	 if(num==array[index]){
    		 counter++;
    	 }
     }
     if(counter>0) {
    	 System.out.println("yes "+num+" is exist "+counter+" times");
    	 
    			 
     }
     else {
    	 System.out.println("number is not exsit");
     }
     }

}


