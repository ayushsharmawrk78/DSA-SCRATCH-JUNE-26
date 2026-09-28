package Lec40;

import java.util.Stack;

public class Insertbottom {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//Stack<Integer>st = new Stack<>();
//st.push(10);
//st.push(20);
//st.push(30);
//st.push(40);
//st.push(50);
//st.push(60);
//
//System.out.println(st);
Insertbottom obj =new Insertbottom();
//obj.reverse(st);
//System.out.println(st);
		
		Queue q = new Queue();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		
		q.enqueue(40);
		q.enqueue(50);
		
		System.out.println(q);
		obj.reverseq(q);
		System.out.println(q);
	}
	
	public void reverseq(Queue q ) throws Exception {
		if(q.isempty()==true) {
			return;
		}
		
		int x = q.dequeue();
		
		
		reverseq(q);
		
		q.enqueue(x);
	}
	
	
	public void insert(Stack<Integer>st , int item) {
		
		if(st.isEmpty()) {
			st.push(item);
			return;
		}
		
		int x =st.pop();
		
		insert(st, item);
		
		st.push(x);
	}
public void reverse (Stack<Integer>st ) {
		
		if(st.isEmpty()) {
		
			return;
		}
		
		int x =st.pop();
reverse(st);
		
	
		insert(st,x);
	}
	

}
