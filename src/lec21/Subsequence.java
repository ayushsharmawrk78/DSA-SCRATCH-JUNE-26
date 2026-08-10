package lec21;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sub("abc", "");
	}
	
	public static void sub(String q , String  ans) {
		if(q.length()==0) {
			System.out.println(ans);
			return;
		}
		
		
		sub(q.substring(1)  , ans+"");
		sub(q.substring(1)  , ans+q.charAt(0));
	}

}
