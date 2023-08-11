package datatype;
 
 
public class StaticDemo {
	String name;
	  long number;
	   static String cname = "tops";
	 
	    public void call() {
		 
		int id=12;
		 System.out.println("student classs in static name");
	 }
	 public static void calling() {
		// id=13;
		 System.out.println("static method in student class");
	 }
	 static {
		 System.out.println("static block in class");
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticDemo s=new StaticDemo();
		s.call();
		
		StaticDemo.calling();
		
	}

}
