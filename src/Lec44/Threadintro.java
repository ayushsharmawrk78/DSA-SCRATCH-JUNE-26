package Lec44;

public class Threadintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		for (int i = 0; i < 100; i++) {
//			System.out.println(i+Thread.currentThread().getName());
//		}
//		
		
		
//		System.out.println(Thread.currentThread().getName());
		
		//fun();
		
Mythread t2 =new Mythread();
//t2.run();
t2.start();

Mythread t3 =new Mythread();

t3.start();
//		Hello h = new Hello();
//		h.run();
		
	}
	
//	public static void fun() {
//		System.out.println(Thread.currentThread().getName());
//	}
//	
	
	
	

}

class Mythread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	for (int i = 0; i < 100; i++) {
		System.out.println(i+Thread.currentThread().getName());
	}
	}

//class Hello {
//	
//	public void run() {
//		for (int i = 0; i < 100; i++) {
//			System.out.println(i+Thread.currentThread().getName());
//	}
//	
//}


}