package opscocept;

import java.util.ArrayList;
import java.util.List;

class Mobile{
	private int ram;
	private String model;
	private double price;

public Mobile(int ram,String model,double price) {
	super();
	this.ram=ram;
	this.model=model;
	this.price=price;
}
@Override
public String toString() {
	return "Mobile [ram=" + ram + ", model=" + model + ", price=" + price + "]";
}
public class ListPractical {
	public static void main(String[] args) {
		
	Mobile m1=new Mobile(12,"samsung",12000);
	Mobile m2=new Mobile(13,"opo",13450);
	Mobile m3=new Mobile(13,"reliance",9000);

List<Mobile> list=new ArrayList<Mobile>();
list.add(m1);
list.add(m2);
list.add(m3);
System.out.println(list);

	
	}
}
}

