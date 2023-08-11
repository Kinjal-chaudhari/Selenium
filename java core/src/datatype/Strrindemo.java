package datatype;

import java.util.Scanner;

public class Strrindemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String user=sc.next();
		System.out.println("enter a string");
				
		// TODO Auto-generated method stub
      System.out.println("hello java");
      char s[]= {'j','a','v','a'};
      System.out.println(s);
     String s1="java";
     System.out.println(s1);
     String s2="welcome to java class";
     System.out.println(s2.length());
     System.out.println(s2.charAt(2));
     String s3="java";
     String s4="java";
     System.out.println("compare"+s3.compareTo(s4));
     System.out.println("comparsing"+s4.compareToIgnoreCase(s4));
     System.out.println("eqals"+s3.equals(s4));
     System.out.println("eqalsignore"+s3.equalsIgnoreCase(s4));
     
     String s5="    kinjal    ";
     System.out.println(s5.isBlank());
     System.out.println(s5.isEmpty());
     System.out.println(s5.trim());
     System.out.println("enter a char at user");
     char c;
     c=sc.next().charAt(0);
     System.out.println(c);
     
     
     
		
	}

}
