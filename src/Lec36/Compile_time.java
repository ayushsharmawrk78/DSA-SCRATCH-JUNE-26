package Lec36;

public class Compile_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a =12;
fun(a);

fun(a,13);
fun("hello");
byte b =10;
fun(b);
	}
	
	public static void main(String[] args ,int a) {
		
	}
	
	public static void fun(int a) {
		System.out.println("hello i am in int function");
	}
	
   public static void fun(int a , int b) {
	   System.out.println("hello i am in two int function");
	}

   public static void fun(String c ) {
	   System.out.println("hello i am in String function");
    }

   public static void fun(byte b) {
	   System.out.println("hello i am in byte function");
    }

    public static void fun() {
    	   System.out.println("hello i am in non parameter function");
    }
	
	

}
