package Lec36;

public class Hierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
byte m =10;
fun(m);
	}
	
//	public static void fun(byte a) {
//		System.out.println("In byte ");
//	}
//	public static void fun(int a) {
//		System.out.println("In int ");
//	}
	public static void fun(Object a) {
		System.out.println("In Object  ");
	}
	public static void fun(Number a) {
		System.out.println("In Object number ");
	}
	public static void fun(Integer a) {
		System.out.println("In int ");
	}
	public static void fun(Long a) {
		System.out.println("In Long  ");
	}
	
//public  static void fun(long a) {
//		System.out.println("In long");
//	}
//public  static void fun(long a) {
//	System.out.println("In long");
//}

}
