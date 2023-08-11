package opscocept;

class parents{
	public void call() {
		System.out.println("this is parent class");
	}
}
class child extends parents{
	public void call() {
		super.call();
		System.out.println("this is child claass");
		//super.call();
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        child c=new child();
        c.call();
	}

}
