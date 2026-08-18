package Lec27;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String >ll = new ArrayList<>();
List<List<String >>ans = new ArrayList<>();
		
partition("nitin", "" ,ll ,ans);
System.out.println(ans);
	}
	
	
	public static void partition(String q , String ans,List<String >ll, List<List<String >>ans2) {
		if(q.length()==0) {
			//System.out.println(ll);
			List<String > ll2 = new ArrayList<>(ll);
ans2.add(ll2);
			return;
		}
		
		
		
		for (int i = 1; i <=q.length(); i++) {
			if(ispalindrome(q.substring(0,i))==true) {
				ll.add(q.substring(0,i));
				partition(q.substring(i), ans+q.substring(0,i)+"|",ll,ans2);
				ll.remove(ll.size()-1);
			}
		
		}
	}
	
	public static boolean ispalindrome(String q) {
		int i =0;
		int j = q.length()-1;
		
	
		while(i<=j) {
			if(q.charAt(i)==q.charAt(j)) {
				i++;
				j--;
			}
			else {
				return false;
			}
		}
		
		return true;
	}

}
