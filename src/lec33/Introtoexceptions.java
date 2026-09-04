package lec33;

public class Introtoexceptions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
fun1();
	}

	
	public static void fun1() throws Exception {
		fun2();
		
	}
public  static void fun2() throws Exception {
		
	fun3();
	}
public static void fun3() throws Exception {
	
	fun4(-2);
	
}
public static void fun4(int a) throws Exception {
	 if(a<0) {
		 throw new Exception("caught an exception");
	 }
	
}
}
