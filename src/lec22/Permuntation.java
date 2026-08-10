package lec22;

public class Permuntation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
per("abc", "");
	}
	
	public static void per(String q , String ans) {
		if(q.length()==0) {
			System.out.println(ans);
			return ;
		}
		
		
		
		for (int i = 0; i < q.length(); i++) {
			per(q.substring(0,i)+q.substring(i+1), ans+q.charAt(i));
		}
	}

}
