package opscocept;

class ThreadByRunnable extends Object  implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			
			System.out.println(i);
		}
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
 class ThreadByClass extends Thread{
	 
	 public void call() {
		 for(int i=1;i<=5;i++) {
			 System.out.println(i);
		 }
		 try {
			Thread.sleep(3000);
		 }
		 catch(InterruptedException e) {
			 e.printStackTrace();
		 }
		 System.out.println("main threads");
	 }
 }
public class Threading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadByClass t1=new ThreadByClass();
		t1.call();
		Thread t3=new Thread();
		System.out.println(t3);
		t3.setName("main first thread");
		for(int i=1;i<=5;i++) {
			System.out.println(t1+" : "+i);
			Thread.sleep(2000);
		}
	}
	
	}
	
	
