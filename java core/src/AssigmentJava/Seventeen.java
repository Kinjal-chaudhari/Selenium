package AssigmentJava;

import java.util.ArrayList;
import java.util.Iterator;

public class Seventeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//WAP to remove the third element from a array list.
	ArrayList list=new ArrayList();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	System.out.println(list);
		list.remove(2);
		System.out.println(list);
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
