package opscocept;

class InterImp  implements Inter1,inter2{

	@Override
	public void interface3() {
		// TODO Auto-generated method stub
		System.out.println("this is first");
	}

	@Override
	public void inerface2() {
		// TODO Auto-generated method stub
		System.out.println("this is second");
	}

	@Override
	public void interface1() {
		// TODO Auto-generated method stub
		System.out.println("this is third");
	}
	
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterImp imp=new InterImp();
		imp.inerface2();
		imp.interface1();
		imp.interface3();
		Inter1.inter();
		inter2.interfacedemo2();
		ineter3.interfac3();
	}

}
