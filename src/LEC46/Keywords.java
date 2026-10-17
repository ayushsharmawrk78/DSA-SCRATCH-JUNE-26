package LEC46;

public class Keywords {

	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
//		Runnable r = ()  -> {
//			Mythread.change();
//		};
		Mythread t2 = new Mythread();
//		Thread t1 = new Thread (r);
		t2.start();
		Thread.sleep(2000);
//		t2.join();
		Mythread.change();
		System.out.println(Mythread.flag);
//System.out.println();
	
	

	}
}

class Mythread extends Thread{
	
	static volatile boolean flag = true;    // 3 

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
check();
	}
	
	
	public void check() {
		
		System.out.println(flag);
		System.out.println("loop started");
		
		while(flag) {
			
		}
		System.out.println(flag);
		
		
		System.out.println("loop end");
	}
	
	public static void change() {
		flag = false;
	}
}


