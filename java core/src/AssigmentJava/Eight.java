package AssigmentJava;

import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //WAP to find the maximum and minimum value of an array.
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("user enter array size");
		for(int index=0;index<array.length;index++)
		{
			System.out.print("enter element at array :["+index+"]" );
            array[index]=sc.nextInt();
		}
		int max=findmax(array);
		int min=findmin(array);
		System.out.println("the maximum value in array:"+max);
		System.out.println("the minum value in array:"+min);
	}

	private static int findmin(int[] array) {
		// TODO Auto-generated method stub
		int max=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]<max) {
				max=array[i];
			}
		}
		return max;
	}

	private static int findmax(int[] array) {
		// TODO Auto-generated method stub
		int min=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>min) {
				min=array[i];
			}
		}
		return min;
	}

}
