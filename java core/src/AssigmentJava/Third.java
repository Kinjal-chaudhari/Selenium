package AssigmentJava;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//W.A.J.P to find factorial for Given Number
		Scanner sc=new Scanner(System.in);
		System.out.println("ener number");
		int number=sc.nextInt();
		int factorial=1;
		for(int i=1;i<=number;i++) {
			factorial*=i;
			System.out.println("factoiral of "+number+ "is"+factorial);
			//System.out.println(factorial);
			
		}
	}

}
