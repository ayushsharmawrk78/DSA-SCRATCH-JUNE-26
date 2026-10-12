package lec45;

public class Threadsintro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		System.out.println(Thread.currentThread().getName());
//		
//		
//		for (int i = 0; i < 100; i++) {
//			System.out.println(i + "helllo");
//		}
//		
//		
//		for (int i = 0; i < 50; i++) {
//			System.out.println(i +  "world");
//		}
		
		
		
		
//		
		Mythread t1 = new Mythread();
		Mythread2 t2 = new Mythread2();
		t1.start();
	t2.start();


//		t1.join(5);
//		for (int i = 0; i < 100; i++) {
//			System.out.println(i+ Thread.currentThread().getName());
//		}
		
		
		
//	Thread.sleep(20000);
		
//		for (int i = 0; i < 100; i++) {
//			System.out.println(i + Thread.currentThread().getName());
//		}


		
		
//		t1.run();
//		t2.run();
		
	
	
	}
	
	

}


class Mythread extends Thread{
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		for (int i = 0; i < 500; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+ Thread.currentThread().getName());
		}
	}
	
	
}
class Mythread2 extends Thread{
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		for (int i = 0; i < 500; i++) {
			
			System.out.println(i+ Thread.currentThread().getName());
		}
	}
	
	
}