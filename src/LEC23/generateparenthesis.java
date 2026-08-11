package LEC23;

import java.util.ArrayList;
import java.util.List;

public class generateparenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	generateParenthesis(3);

	}

	
	 public static ArrayList<String> generateParenthesis(int n) {
			ArrayList<String> ll = new ArrayList<>();
		 
		 help(n, "", 0, 0, ll);
		 
		 System.out.println(ll);
		 return ll;
		 
	    }
	 public static void help(int n , String ans, int open , int close , ArrayList<String> ll) {
		 if(ans.length()==2*n) {
			ll.add(ans);
			 return;
		 }
		 
		 if(open<n) {
			 help(n, ans+"(", open+1, close, ll);
		 }
	if(close<n&&close<open) {
		 help(n, ans+")", open, close+1, ll);
	}

		 
	 }
	 
	 
}
