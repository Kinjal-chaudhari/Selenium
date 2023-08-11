package datatype;

import java.util.Scanner;

public class Nestedifdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
     System.out.println("enter age:");
     int age;
     age=sc.nextInt();
     if(age>18) 
    	 if(age<60) {
    		 System.out.println("you are eligable");
    	 }
    	 else {
    		 System.out.println("your age is grater then 18 but less then 60");
    		 
    	 }
     else {
    	 System.out.println("your age less then 18");
     }
    	 
     }
	
	
	}


