package AssigmentJava;

import java.util.Scanner;

public class Ninteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Marks Grade 91-100 AA 81-90 AB 71-80 BB 61-70 BC 51-60 CD 41-50 DD <=40 Fail


		Scanner sc=new Scanner(System.in);
		int marks;
		marks=sc.nextInt();
		if(marks<=40) {
			System.out.println("you are fail");
		}
		else if(marks>=41&&marks<=50) {
			System.out.println("you got dd grade");
			
		}
		else if(marks>=51&&marks<=60) {
			System.out.println("you got cd grade");
		}
		else if (marks>=61&&marks<=70) {
			System.out.println("you got bc grade");
			
		}
		else if (marks>=71&&marks<=80) {
			System.out.println("you got bb grade");
			
		}
		else if (marks>=81&&marks<=90) {
			System.out.println("you got ab grade");
			
		}
		else if (marks>=91&&marks<=100) {
			System.out.println("you got aa grade");
			
		}
		else {
			System.out.println("invalid input");
		}
	}
	
	}
	


