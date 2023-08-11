package opscocept;


class oldemo{
	
	public void area(double r) {
		System.out.println("area of circle"+(Math.PI*r*r));
	}
	public void area(double h,double b) {
		System.out.println("area of triangle"+((h*b)/2));
	}
	public void area(int l,int b) {
		System.out.println("area of rect"+(l*b));
	}
	
}
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      oldemo a1=new oldemo();
      a1.area(3.3);
      a1.area(30, 23);
      a1.area(20, 50);
      
	}

}
