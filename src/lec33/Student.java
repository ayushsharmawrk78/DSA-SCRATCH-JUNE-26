package lec33;

public class Student {

	
	String name ="yatish";
private	int age =20;
	
	public Student() {
		
	}
public Student(String name , int age) {
		this.name=name;
		this.age=age;
	}

public int getage() {
	return this.age;
}
public void setage(int age) throws Exception {
if(age<0) {
 throw  new  Exception("hello age cannot be -ve");
	
}
	this.age=age;
}

}

