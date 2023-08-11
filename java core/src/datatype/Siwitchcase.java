package datatype;

import java.util.Scanner;

public class Siwitchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		System.out.println("1.you select hindi/n2.you select english/n3.you select gujarati");
		int lang;
		lang=sc.nextInt();
		switch(lang) {
		case 1:
		{
			System.out.println("you select hindi");
			break;
			
		}
		case 2:
		{
			System.out.println("you select english");
			break;
			
		}
		case 3:{
			System.out.println("you select gujarti");
			break;
		}
		default:{
			System.out.println("you select invalid input");
			break;
		}
			
			
			
		}
		
	}

}
