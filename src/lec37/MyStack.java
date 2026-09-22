package lec37;

public class MyStack {

	
protected  int []arr;
	
protected	int top;

public MyStack() {
	
	arr = new int [5];
	top = -1;
}
public MyStack(int size) {
	
	arr = new int [size];
	top = -1;
}

public boolean isempty() {
	
	if(top==-1) {
		return true;
	}
	
	
	
	return false;
}

public boolean isfull() {
	
	if(top==arr.length-1) {
		return true;
	}
	
	return false;
}

public void push (int item) throws Exception {
	
	
	top++;
	arr[top]=item;
}


public int pop() throws Exception  {
	if(isempty()==true) {
		throw new Exception("Stack is empty");
		
	}
	
	int val =arr[top];
	top--;
	return val;
	
	
}

public int peek() throws Exception {
	if(isempty()==true) {
		throw new Exception("Stack is empty");
		
	}
	int val =arr[top];
	
	return val;
}
	

public int size() {
	return top+1;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub

	
	String a ="[ ";
	
	if(isempty()) {
		a =a+" ]";
		return a;
	}
	for (int i = 0; i <=top; i++) {
		a = a+arr[i]+" , ";
	}
	
	a =a+" ]";
	
	return a;
	}


	
}
