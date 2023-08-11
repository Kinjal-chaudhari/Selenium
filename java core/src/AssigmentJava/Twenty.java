package AssigmentJava;

import java.util.Scanner;

class Balance{
	public void account()throws ArithmeticException  {
		Scanner sc=new Scanner(System.in);
		int balance=sc.nextInt();
		System.out.println("user enter amount for withdrow");
		if(balance>=2000) {
			 {
				throw new ArithmeticException("\"Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.\"");

			}
		}
		else {
			System.out.println("your transtaction complte succesfully ");
		}

	}
	
}
public class Twenty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//W.A.J.P. to create a custom exception if Customer withdraw amount which is greater than account balance then program will show custom exception otherwise amount will deduct from account balance. Account balance is:2000 Enter withdraw amount:2500 Sorry, insufficient balance, you need more 500 Rs. To perform this transaction
 Balance b=new Balance();
 b.account();
 System.out.println("done");
		

	}
}


		
	

	
	

