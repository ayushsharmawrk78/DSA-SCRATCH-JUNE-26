package Lec15;

public class Playingwithgoodstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a ="abcaeioum";
		System.out.println(fun(a));
	
	}
	
	public static int fun(String s) {
		
		int ans =0;
		
		
		for (int i = 0; i <s.length(); i++) {
			
			int count = 0;
			
			int  j=i;
			
			while(check(s.charAt(j))==true) {
			count++;
			j++;
			ans = Math.max(ans, count);
			}
			count =0;
			i=j;
			
		}
		
		
		return ans;
		
	}
	
	
	public static boolean check(char c) {
		
		
		if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u') {
			return true;
		}
		return false;
	}

}
