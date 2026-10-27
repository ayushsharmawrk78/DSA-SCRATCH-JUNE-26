package Lec49;

import Lec49.Mergetwosortedlinkedlist.ListNode;

public class SortList {
	class ListNode {
	    int val;
	     ListNode next;
	   ListNode() {}
	    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
 
	
	
	
	public ListNode sort(ListNode head) {
		if(head==null||head.next==null) {
			return head;
		}
		
		ListNode mid = Middle(head);
		ListNode temp = mid.next;
		mid.next=null;
		
		ListNode left = sort(head);
		ListNode right = sort(temp);
		
		return merge(left, right);
	}
	
	public ListNode merge(ListNode heada , ListNode headb) {
		
		ListNode dummy = new ListNode();;
		
		ListNode temporary  = dummy;
		
		ListNode t1 = heada;
		
		ListNode t2 = headb;
		
		while(t1!=null&& t2!=null) {
			
			
			if(t1.val<t2.val) {
				dummy.next = t1;
				t1 = t1.next;
				dummy = dummy.next;
			}else {
				dummy.next = t2;
				t2 = t2.next;
				dummy = dummy.next;
			}
		}
		
		
		if(t1==null) {
			dummy.next=t2;
		}else {
			dummy.next=t1;
		}
		
		return temporary.next;
		
	}
	
	 public ListNode Middle(ListNode head) {
		 
		 ListNode slow = head;
		 ListNode fast = head;
		 
		 
		 while( fast!=null&& fast.next!=null) {
			 fast = fast.next.next;
			 slow = slow.next;
		 }
		 
		 
		 return slow;
		 
		 
	 }
}