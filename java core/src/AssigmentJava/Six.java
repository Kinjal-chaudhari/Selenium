package AssigmentJava;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//W.A.J.P for create Fibonacci Series.
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int first=sc.nextInt();
		int firstterm=0;
		int secondterm=1;
		for(int i=1;i<=first;i++){
			System.out.println(firstterm+"");
			int nextterm=firstterm+secondterm;
			firstterm=secondterm;
			secondterm=nextterm;
		}
		
	}

}
