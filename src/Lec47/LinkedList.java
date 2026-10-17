package Lec47;

public class LinkedList {
	
	class Node{
		
		Node next ;
		int val ;
	}
	
	private Node head; // 1st node address
	private Node tail;// last node address
	private int size;
	
//o(1)	
	public void addfirst(int item) {
		Node nn = new Node();
		nn.val=item;
		if(size==0) {
			this.head=nn;
			this.tail = nn;
			this.size++;
		}else {
		
			nn.next = head;
			head = nn;
			this.size++;
		}
	}
	//o(1)
	public void addlast(int item) {
		Node nn = new Node();
		nn.val=item;
		if(size==0) {
			addfirst(item);
		}else {
			tail.next=nn;
			this.tail=nn;
			this.size++;
		}
	}
	
	public int getfirst() throws Exception {
		if(size==0) {
			throw new Exception("linked list is empty");
		}
		
		return head.val;
		
	}
	public int getlast() throws Exception {
		if(size==0) {
			throw new Exception("linked list is empty");
		}
		
		return tail.val;
		
	}
	
	//O(n)
	public Node getnode(int k) throws Exception {
		
		if(k<0||k>=size) {
			throw new Exception("invalid index");
		}
		
		Node temp = head;
		
		for(int i =1;i<=k;i++) {
			temp = temp.next;
		}
		
		
		
		return temp;
	}
	
	// o(n)
	public void addatindex(int item , int  k) throws Exception {
	
		if(k<0||k>=size) {
			throw new Exception("invalid index");
		}
		
		if(k==0) {
			addfirst(item);
		}else if (k==size-1) {
			addlast(item);
		}else {
			Node nn = new Node();
			nn.val=item;
			Node k_prev = getnode(k-1);
			nn.next =k_prev.next;
			k_prev.next=nn;
		}
		
	}
	
	public int removefirst() throws Exception {
		if(size==0) {
			throw new Exception("Linked list is empty");
		}
		
		Node temp = head;
		
		head = head.next;
		
		if(size==1) {
			tail = null;
		}
		size--;
		temp.next=null;
		return temp.val;
	}
	public int removelast() throws Exception {
		if(size==0) {
			throw new Exception("Linked list is empty");
		}
		if (size==1) {
			return removefirst();
		}else {
	
		Node n = getnode(size-2);
		Node temp = tail;
		tail  = n;
		size--;
		tail.next=null;
		return temp.val;
		
		}
	}
		// o(n)
	public int removeatindex(int k) throws Exception {
		if(size==0) {
			throw new Exception("Linked list is empty");
		}
		if (k==0) {
			return removefirst();
		}
		else if(k==size-1) {
			return removelast();
		}
		
		else {
	
	Node prev = getnode(k-1);
	
	Node curr = getnode(k);
	
	prev.next=curr.next;
	curr.next=null;
	size--;
	return curr.val;
	
		
		}
	}
	
	
	@Override
	public String toString() {
Node temp = head;
String a ="";
	
	 
	 while(temp!=null) {
		 a= a+ temp.val+ " -------> ";
		 temp = temp.next;
		 
	 }
	 
	 
	 return a;
	
	
	
	}


}
