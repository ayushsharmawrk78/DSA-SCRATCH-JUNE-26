package lec33;

public class Exceptionpropagation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
fun();
	}
	public static void fun() {
		System.out.println("hello in fun1");
		
		
		try {
			fun2();
		}catch(Exception e) {
			System.out.println("hello got an exception");
		}
	
	}
public static void fun2() {
		
		System.out.println("hello in fun2");
		fun3();
	}
public static void fun3() {
	
	System.out.println("hello in fun3");
	fun4();
	
}
public static void fun4()  {
	
	int a =10;
	if(a<11) {
System.out.println(10/0);
	}
	System.out.println("hello");
	
}
}
