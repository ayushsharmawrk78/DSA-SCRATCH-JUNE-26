package Lec38;

import java.util.Stack;

public class Sunnybuilding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public static int [] sunny(int []arr) {
	
	int []ans = new int [arr.length];
	
	
	Stack<Integer>st = new Stack<>();
	
	for (int i = 0; i < arr.length; i++) {
		
		
		while(!st.isEmpty()&&arr[i]>arr[st.peek()]) {
			st.pop();
		}
		if(st.isEmpty()) {
			ans[i]=i+1;
		}else {
			ans[i]=i-st.peek();
		}
		
		
		st.push(i);
	}
	
	
	
	
	
	return ans;
	
	
	
}
}
