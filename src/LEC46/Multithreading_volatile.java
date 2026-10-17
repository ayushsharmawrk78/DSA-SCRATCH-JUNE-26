package LEC46;

public class Multithreading_volatile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Runnable r  =() ->{
	
	
	for (int i = 0; i < 10; i++) {

//		System.out.println(Thread.currentThread().getState());
		System.out.println(i + Thread.currentThread().getName());
	}
};



Thread t1 = new Thread (r);
Thread t2 = new Thread (r);
Thread t3 = new Thread (r);
//System.out.println(Thread.currentThread().getState());
t1.start();
t2.start();
t3.start();
	}
	
	

}
