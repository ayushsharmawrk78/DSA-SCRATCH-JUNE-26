package LEC5;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =10;
		int b = 20;
		int c =a+b;
		//System.out.println(c*100);
		
		//fun();
		//fun2(100, 200);
		int d = fun3(400,200);
System.out.println(d);
	}
	
	 
	// public static return type function name 
	public static void fun() {
		
		
		int a = 10;
		int b =20;
		int c = a+b;
		System.out.println(c*100);
		
	}
	public static int fun4() {
		
		
		
		int a =10;
		int b =20;
		int c = a+b;
		
		return c;
	}
	
	
	public static void fun2(int a , int b) {
		
		
		int c = a+b;
		System.out.println(c);
	}
	
	
public static int fun3(int a , int b) {
		
		int c =a+b;
		return c;
		
	}
}
