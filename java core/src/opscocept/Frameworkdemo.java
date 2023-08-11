package opscocept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Frameworkdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // List list=new ArrayList();
   ArrayList list=new ArrayList();
   list.add(1);
   list.add("selenium");
   list.add("java");
   list.add(5);
   System.out.println(list);
   list.size();
   list.remove("java");
   System.out.println(list);
   Iterator itr=list.iterator();
   while(itr.hasNext()) {
	   System.out.println(itr.next());
   }
	}

}
