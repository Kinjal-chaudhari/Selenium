package opscocept;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	try{
		

	
		
	Scanner sc=new Scanner(System.in);
	
		System.out.println("enter a = ");
		int a=sc.nextInt();
		System.out.println("enter b");
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
	}
	catch(ArithmeticException e ){
		System.out.println("divide not by zero");
		
		
	
	}
	catch(InputMismatchException e) {
		System.out.println("input must bu number");
	}

	}

	
	
	
	
	

}
