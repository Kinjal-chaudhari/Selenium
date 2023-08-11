package datatype;

import java.util.Scanner;

class a{
	public void add() {
		System.out.println("hello add");
	}
}
public class Conditionalstatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      a obj=new a();
      
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		// simple if statment
		if(a>b)
		{
			System.out.println("a is bigger than b");
		}
		
	

	// if else demo
	if(a>b)
	{
		System.out.println("a is bigger than b");
		
	}
	else {
		System.out.println("b is bigger then a");
	}
	}

}
