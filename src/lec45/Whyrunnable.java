package lec45;

public class Whyrunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Runnable r  = new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
		Runnable r = ()->
		{
			for (int i = 0; i <10; i++) {
				System.out.println(i+Thread.currentThread().getName());
			}
		};
		
Thread t1 = new Thread(r);
Thread t2 = new Thread(r);
Thread t3 = new Thread(r);
Thread t4 = new Thread(r);
Thread t5 = new Thread(r);
Thread t6 = new Thread(r);
t1.start();
t2.start();
t3.start();
t4.start();
t5.start();


	}
	
	
	
	

}
