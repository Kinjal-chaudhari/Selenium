package datatype;

class Student{
	int i,j;
	Student(){
		
	}
	Student(int i){
		System.out.println("demo"+i);
	}
	Student(int i,int j){
		this.i=i;
		this.j=j;
		System.out.println("value"+i+"j"+j);
		
	}
	public void Showdata() {
		System.out.println("i ="+i+"j"+j);
	}
}

public class ConstructtionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student d=new Student();
		Student d1=new Student(12,123);
      d1.Showdata();
	}

}
