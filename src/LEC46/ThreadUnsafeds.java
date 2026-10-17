package LEC46;

import java.util.ArrayList;
import java.util.Vector;

public class ThreadUnsafeds {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		ArrayList<Integer>ll = new ArrayList<>();
		
		Vector<Integer>ll = new Vector<>();
		
		
		Runnable r =()->{
			for (int i = 0; i <1000; i++) {
				ll.add(i);
			}
		};
		
		Thread t = new Thread(r);
		Thread t1 = new Thread(r);
		
		t.start();
		t1.start();
		
		t.join();
		t1.join();
		
		System.out.println(ll.size());
	}

}
