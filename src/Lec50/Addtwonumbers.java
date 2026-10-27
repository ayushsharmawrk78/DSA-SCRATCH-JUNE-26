package Lec50;



public class Addtwonumbers {
	public class ListNode {
	    int val;
	     ListNode next;
	   ListNode() {}
	    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	
 public ListNode sum(ListNode l1 , ListNode l2) {
	 ListNode t1 = l1;
	 ListNode t2  = l2;
	 ListNode dummy = new ListNode();
	 ListNode head = dummy;
	 int sum =0;
	 int carry =0;
	 while(l1!=null && l2 !=null) {
		 
		 sum =0;
		 ListNode  nn = new ListNode();
		 sum = l1.val+l2.val+carry;
		 carry = sum/10;
		 sum  = sum%10;
		 nn.val = sum;
		 dummy = dummy.next;
		 t1=t1.next;
		 t2=t2.next;
	 }
	 while(t1!=null) {
		 ListNode nn = new ListNode();
		 sum =0;
		 sum = t1.val+carry;
		 carry = sum/10;
		 sum  = sum%10;
		 nn.val=sum;
		 dummy = dummy.next;
		 t1=t1.next;
		 
	 }
	 while(t2!=null) {
		 ListNode nn = new ListNode();
		 sum =0;
		 sum = t2.val+carry;
		 carry = sum/10;
		 sum  = sum%10;
		 nn.val=sum;
		 dummy = dummy.next;
		 t2=t2.next;
		 
	 }
	 if(carry!=0) {
		 ListNode nn = new ListNode();
		 nn.val=carry;
		 dummy.next=nn;
	 }
	 return head.next;
 }
	
}
