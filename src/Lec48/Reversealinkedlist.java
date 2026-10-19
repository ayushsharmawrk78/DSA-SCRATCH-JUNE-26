package Lec48;

import Lec48.MiddleNodeofthelinkedlist.ListNode;

public class Reversealinkedlist {

	
	
	
	public ListNode reverse(ListNode head) {
		
		ListNode prev = null;
		
		ListNode curr = head;
		
		while(curr!=null) {
			ListNode temp = curr.next;
			curr.next=prev;
			prev = curr;
			curr = temp;
		}
		
		
		return prev;
	}
}
