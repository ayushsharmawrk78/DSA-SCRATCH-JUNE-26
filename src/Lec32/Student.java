package Lec32;

public class Student {

	
	String name  = "yatish";
	
	private int age =20 ;
	
	
	
	public Student() {
		
	}
	// Constructor
	
	public Student(String name , int age ) {
		
		if(age<0) {
			System.out.println("helloo age cannot be -ve");
			return;
		}
		this.name=name;
		this.age=age;
	}
	
	
	//setter
	public void setage(int age ) {
		
		if(age<0) {
			System.out.println("helloo age cannot be -ve");
			return;
		}
		this.age=age;
	}
	
	//getter
public int  getage() {
		return this.age;
	}
	
	
	
	
	
	
	
	
	
	
};
