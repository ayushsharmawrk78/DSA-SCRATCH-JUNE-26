package lec34;

public class Demo {

	static int var2 = 50;
	
	
	int var =10;
	
	public void fun() {
		System.out.println("hello from "+ this.var);
		System.out.println(var2);
	}
	
	public static void fun2() {
//		System.out.println(this); wrong
		System.out.println("hello from "+ var2);
	}
	
	
	
	
//	public static void fun() {
//		System.out.println("hello");
//	}
	
}
