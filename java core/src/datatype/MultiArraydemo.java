package datatype;

import java.util.Scanner;

public class MultiArraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row of array:");
		int row=sc.nextInt();
		System.out.println("enter coulum of array:");
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;i<col;i++) {
				System.out.print("enter elemt at array["+i+"]["+j+"]");
				 arr[i][j]=sc.nextInt();
				
			}
			System.out.println();
		}
		System.out.println("final output of arrat 1");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				
				System.out.print(arr[i][j]+"");
			}
			System.out.println();
		}
	}

}
