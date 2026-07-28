package Lec17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean []arr = new boolean [5]; // can't grow
		
		//System.out.println(arr[0]);
	ArrayList<Integer> ll = new ArrayList<>();// uncheck
	// by default of address 
	
	ll.add(1);//0
	ll.add(2);//1
	ll.add(2,3 );//2
	
	System.out.println(ll);
	
//	ll.add(4,5); not possible to skip a index in arraylist
	
	
	
	ll.remove(1);
	System.out.println(ll);
	
	System.out.println(ll.size());
	
	System.out.println(ll.get(0));
	//String m  = ll.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(ll));
	//System.out.println(m);
	
	
	// sort 
	
	
ll.add(12);
ll.add(13);
ll.add(120);
ll.add(140);
	Collections.sort(ll);
	
	
	Collections.reverse(ll);
	System.out.println(ll);
	
	
	// traverse
	
	for (int i = 0; i < ll.size(); i++) {
		System.out.println(ll.get(i));
	}
	// for each loop
	for(int val:ll) {
		System.out.print(val+" ");
	}
	
	
	}

}
