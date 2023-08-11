package datatype;
class user{
	

private int id;
private String name;
private long number;

user(){
	
}
user(int id,String name,long number){
	this.id=id;
	this.name =name;
	this.number=number;
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
@Override
public String toString() {
	return "user [id=" + id + ", name=" + name + ", number=" + number + "]";
}

}



public class Construction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		user u1=new user(1,"kinjal",416729);
		System.out.println(u1);
		user u2=new user(2,"jigu",99254789);
		System.out.println(u2);
		

	}

}
