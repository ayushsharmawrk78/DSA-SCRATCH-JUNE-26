package lec33;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class trycatchblocks {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub

//	 int [] arr = new int [6];
//	 String s = "hello";
//		System.out.println(s.charAt(12)); // unchecked
//		
//		FileReader fs   = new FileReader("abc.txt"); // checked 
		
		
		try {
			int []arr = new int [4];
			System.out.println(arr[7]);
		//int a = 10/0;
			
//			Object  a = null;
//			System.out.println(a.getClass());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("hello array index out");
		}
catch(ArithmeticException e) {
	e.printStackTrace();
	System.out.println("wrong divison");
		}
catch(NullPointerException e) {
	e.printStackTrace();
	System.out.println("Null");
		}
finally {
	System.out.println("helllooooooo in finallyyy ");
}
		
	
	}
	public static void fun(int a) {
		
		try {
			fun2(-4);
		}
		catch(Exception e) {
			System.out.println("got ");
		}
	
	}
	
	
	

	
	
	
public static void fun2(int a) throws Exception {
		
	
	if(a<0) {
		throw new Exception("hey a is -ve");
	}
	}
}
