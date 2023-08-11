package opscocept;
class A{
	A(){
		System.out.println("this is comstruction");
	}
	
	public void classA(){
		System.out.println("this is a class");
	}
}

	
class B extends A{
	public void classB() {
		System.out.println("this is b class");
	}
}

	class c extends B{
		public void classc() {
			System.out.println("this is c class");
		}
	}
	class d extends A{
		public void classd() {
			System.out.println("this is d class");
		}
	
}



public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		System.out.println("this is demo for inhertiance");
		
		B b=new B();
		b.classA();
		b.classB();
		c c1=new c();
		c1.classc();
		
		
	
	}

}
