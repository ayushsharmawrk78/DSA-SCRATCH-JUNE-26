package Lec40;

public class Queue {

	
	protected int []arr;
	
	int size;
	int front;
	
	
	public Queue() {
		arr =new int [5];
		size =0;
		front=0;
	}
	public Queue(int cap) {
		arr =new int [cap];
		size =0;
		front=0;
	}
	
	
	public boolean isfull() {
		
		
		if(size==arr.length) {
			return true;
		}else {
			return false;
		}
	}
	
//	public void enqueue(int item) throws Exception {
//		if (isfull()) {
//			throw new Exception("Queue full hain bhai");
//			
//			
//		}
//		
//		
//		arr[size]=item;
//		size++;
//	}
//	
//	
//	public int dequeue() {
//		int val = arr[front];
//		front++;
//		size--;
//		return val;
//	}
	
	public void enqueue(int item) throws Exception {
		if (isfull()) {
			throw new Exception("Queue full hain bhai");
			
			
		}
		
		int idx = (front+size)%arr.length;
		arr[idx]=item;
		size++;
	}
	
	
	public int dequeue() throws Exception {
		
		if(isempty()==true) {
			throw new  Exception("Bhai queue empty hain");
			
		}
		int val = arr[front];
		front = (front+1)%arr.length;
		size--;
		return val;
	}
	
	public boolean isempty() {
		if(size==0) {
			return  true;
			
		}else {
			return false;
		}
	}
	public int getfront() throws Exception {
		if(isempty()==true) {
			throw new  Exception("Bhai queue empty hain");
			
		}
		int val = arr[front]; 
		return val;
	}
	
 @Override
public String toString() {
	// TODO Auto-generated method stub
String a ="[";

for (int i = 0; i < size; i++) {
	int idx = (front+i)%arr.length;
	a =a+arr[idx]+" , ";
}

a= a+"]";
return a;
}
	
	
	
	
	
	
	
	
	
	
	
	
}
