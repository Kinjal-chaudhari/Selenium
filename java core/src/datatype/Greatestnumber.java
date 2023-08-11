package datatype;

import java.util.Scanner;

public class Greatestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //first program to assignment in core java
		//wap to take 3 number from user and check which one is greater
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("user succsesfully enter three numbers");
		
			
		
		
		if(a>=b) {
			System.out.println("a is bigger");
		}
		else if(a>=c) {
			System.out.println("a is bigger");
		}
		else if(b>=a) {
			System.out.println("b is bigger");
		}
		else if(b>=c) {
			System.out.println("b is bigger");
		}
		else if(c>=a) {
			System.out.println("c is bigger");
		}
		else if(c>=b) {
			System.out.println("c is bigger");
		}
		else {
			System.out.println("number invalid");
		}
		}
		}
	
	
	


