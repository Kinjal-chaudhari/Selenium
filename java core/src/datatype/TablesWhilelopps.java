package datatype;

import java.util.Scanner;

public class TablesWhilelopps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("enter number to print the table");
		int i=1;
		while(i<=10)
		{
			
			int result=num*i;
			i++;
			System.out.println(num+"*"+i+"="+result);
		}
	}

}
