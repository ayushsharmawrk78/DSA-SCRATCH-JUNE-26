package Lec48;

import Lec48.MiddleNodeofthelinkedlist.ListNode;

public class Cycledetect {

	
	
	public boolean cycledetect(ListNode head) {
		ListNode slow = head;
		ListNode  fast  = head;
		
		while(fast!=null && fast.next!=null) {
			
			fast = fast.next.next;
			slow = slow.next;
			
			
			if(slow==fast) {
				return true;
			}
		}
		
		return false;
	}

}
