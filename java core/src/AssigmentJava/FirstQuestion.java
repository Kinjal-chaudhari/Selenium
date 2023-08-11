package AssigmentJava;

import java.util.Scanner;

public class FirstQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		  int a=sc.nextInt();
		  int b=sc.nextInt();
		  int c=sc.nextInt();
		  System.out.println("user enter three number sucessfully");
		  
		  if(a>=b&&a>=c) {
			  System.out.println("a is bigger");
		  }
		  else if(b>=a&&b>=c) {
			  System.out.println("b is bigger");
		  }
		  else {
			  System.out.println("c is bigger");
		  }
			
	}
}


