package Lec49;

import Lec49.Mergetwosortedlinkedlist.ListNode;

public class Intersection {
	class ListNode {
	    int val;
	     ListNode next;
	   ListNode() {}
	    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
 
	
	
	public ListNode intersection(ListNode heada , ListNode headb) {
		
		
		ListNode a = heada;
		ListNode b = headb ;
		
		while(a!=b) {
			
			if(a==null) {
				a =headb;
			}else {
				a = a.next;
			}
			
			if(b==null) {
				b = heada;
			}else {
				b=b.next;
			}
		}
		
		return a;
		
		
	}
}
