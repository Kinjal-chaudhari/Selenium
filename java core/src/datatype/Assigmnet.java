package datatype;

import java.util.Scanner;

public class Assigmnet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Account balance is:2000 Enter withdraw amount:2500 Sorry, insufficient balance, you need more 500 Rs.
		
		Scanner sc=new Scanner(System.in);
		int balance=sc.nextInt();
		System.out.println("user enter amount for withdrow");
		if(balance>=2000) {
			System.out.println("sorry you have not sufficient blance");
		}
		else {
			System.out.println("your transtaction complte succesfully ");
		}
	}

}
