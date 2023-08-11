package datatype;

import java.util.Scanner;

public class TablePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number to print the table");
    int num=sc.nextInt();
    /*for(int i=1;i<=10;i++) {
    	int result=num*i;
    	System.out.println(num+"*"+i+"="+result);
    }*/
	

   
    for(int a=1;a<=10;a++){
    	System.out.println(num+"*"+a+"="+(num*a));
    
    }
	}
}
	
    
	


