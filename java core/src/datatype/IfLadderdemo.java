package datatype;

import java.util.Scanner;

public class IfLadderdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int marks;
		marks=sc.nextInt();
		if(marks<35) {
			System.out.println("you are fail");
		}
		else if(marks>=35&&marks<=60) {
			System.out.println("pass class");
			
		}
		else if(marks>=60&&marks<=80) {
			System.out.println("first class");
		}
		else if (marks>=80&&marks<=100) {
			System.out.println("you got dirstiction");
			
		}
		else {
			System.out.println("invalid input");
		}
	}

}
