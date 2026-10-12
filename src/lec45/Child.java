package lec45;

public class Child extends Demo implements Runnable  {

	
	public  void fun2() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {

		
		Child obj = new Child();
Thread t1 = new Thread (obj);
t1.start();
		obj.fun2();
//        obj.fun();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		fun2();
	}

}
