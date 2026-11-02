package Lec50;

import Lec48.Cycledetect;

public class Cycleremoval {

	
	public static void main(String[] args) throws Exception {
		LinkedList ll = new LinkedList();
		ll.addlast(1);
		ll.addlast(2);
		ll.addlast(3);
		ll.addlast(4);
		
		ll.addlast(5);
		ll.addlast(6);
		ll.addlast(7);
		ll.addlast(8);
//		System.out.println(ll);
System.out.println(ll.cycledetect2());
		
		ll.addcycle(3);
	System.out.println(ll.cycledetect2());
	
	ll.cycleremoval1();
	System.out.println(ll.cycledetect2());
		
	}
	
	
}
