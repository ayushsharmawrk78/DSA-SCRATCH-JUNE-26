package Lec38;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a =")((())))";
System.out.println(isvalid(a));
	}

	
	public static boolean isvalid(String p) {
		
		
		Stack<Character>st = new Stack<>();
		
		
		for (int i = 0; i < p.length(); i++) {
			
			
			
			if(p.charAt(i)=='(') {
				st.push(p.charAt(i));
			}else if (p.charAt(i)==')'&&!st.isEmpty()) {
				st.pop();
			}else if(st.isEmpty()) {
				return false;
			}
			
		}
		
		if(st.isEmpty()) {
			return true;
		}
		
		return false;
		
	}
}
