package AssigmentJava;

public class Twenty28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// W.A.J.P to Print pattern Given Below.
		for(int r=1;r<=5;r++) {
			for(int c=1;c<=r;c++)
			{
				System.out.print("x");
			}
			System.out.println();
		}
	
		System.out.println("onthe pattern demo");
		/*for(int r=1;r<=4;r++) {
			for(int c=1;c<=4;c++) {
				System.out.print("*");
			}
		System.out.println();
   }*/

	for(int r=1;r<=4;r++) {
		for(int c=1;c<=4;c++) {
			System.out.print("*");
		}
		System.out.println();
			
		}
	
	for(int r=1;r<=4;r++) {
		for(int c=1;c<=r;c++) {
			System.out.print("*");
			
		}
		System.out.println();
	}
	System.out.println("new pattern");
	for(int r=1;r<=4;r++) {
		for(int c=1;c<=4;c++)
		{
			System.out.print(c);
		}
		System.out.println();
	}
	System.out.println("new  other pattern");
	for(int r=1;r<=4;r++) {
		for(int c=1;c<=r;c++)
		{
			System.out.print(c);
		}
		System.out.println();
	}
	System.out.println("my ne pattern");
	for (int r=1;r<=4;r++) {
		for(int c=1;c<=r;c++)
		{
			System.out.print(r);
		}
		System.out.println();
	}
	System.out.println("my extra pattern");
	for (int r=1;r<=4;r++) {
		for(int c=4;c>=r;c--)
		{
			System.out.print(c);
		}
		System.out.println();
	}
}

	



	}

}
