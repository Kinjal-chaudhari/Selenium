package datatype;

 class call
 {
	 public int Sayello() {
		 System.out.println("hello eeveryone");
		 return 1234;
	 }
	public int Add() {
	 int a =10,b=20;
	  int c=a+b;
	 System.out.println("add two numbers"+c);
	 return 1234;
	}
 }
public class NewFunction {
	public static void main(String[] args) {
		call c = new call();
		int i=c.Sayello();
		int j=40,l=40;
		int m=c.Add();
		System.out.println("other numbers"+m);
		
		int k=c.Add();
		System.out.println("hello");
	}
 
}
