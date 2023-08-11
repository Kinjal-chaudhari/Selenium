package AssigmentJava;
class Threadrunable extends Object implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("main thread");
		}
	}

	
	
}
public class Thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//WAP to create one thread by implementing Runnable interface in Class.
		Thirteen t=new Thirteen();
		Thread t1=new Thread();
		System.out.println(t1);
	}

}
