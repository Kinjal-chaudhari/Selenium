package opscocept;


	
abstract class rbi{
	 abstract public void intrest();
	 abstract public void hl();
	 public static  void rerto() {
		 System.out.println("reporate :+-4%");
	 }
}
class sbi extends rbi{
	public void intrest() {
		System.out.println("4% intrest");
	}
	public void hl() {
		System.out.println("6% intrest");
	}
}
class hdfc  extends rbi{
	public void intrest() {
		System.out.println("7% intrest");
		
	}
	public void hl() {
		System.out.println("9% intrest");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      sbi si=new sbi();
      si.intrest();
      si.hl();
      hdfc hc=new hdfc();
      hc.intrest();
      hc.hl();
      si.rerto();
      hc.rerto();
	}

}
