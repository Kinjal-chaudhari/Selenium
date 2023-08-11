package datatype;

import java.util.Scanner;

public class SumValuesArray {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// second assignment program
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("user enter array size");
		for(int index=0;index<array.length;index++)
		{
			System.out.print("enter element at array :["+index+"]" );
            array[index]=sc.nextInt();
		}
		int sum=0;
		for( int index=0;index<array.length;index++) {
			sum=sum+array[index];
			System.out.println("total of array is:"+(sum));
		}
		
	}
	
		}


