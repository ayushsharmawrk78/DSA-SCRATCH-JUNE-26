package Lec6;

public class Functionq {
static int a =2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello");
		if(a<0) {
			return;
		}
		
		
		fun();
		
		
		
	}

	
	public static void fun() {
		
		System.out.println("hello in fun");
		a--;
		String []args = {};
		main(args);
	}
}
