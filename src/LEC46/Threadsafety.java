package LEC46;

import java.util.concurrent.locks.ReentrantLock;

public class Threadsafety {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	Runnable r = ()->{
		
		Random.increment();
		
	};
	
	Thread t1 = new Thread(r);
	Thread t2 = new Thread(r);
	
	t1.start();
	t2.start();
	
	t1.join();
	t2.join();
	
	
	System.out.println(Random.counter);
	
	}

}
class Random {
 static int counter =0;
 static ReentrantLock lock = new ReentrantLock();
 
 public  synchronized static void increment () {
	
	 lock.lock();
	 for (int i = 0; i < 1000; i++) {
		counter++;
	}
	 
	 lock.unlock();
 }
 
 
}