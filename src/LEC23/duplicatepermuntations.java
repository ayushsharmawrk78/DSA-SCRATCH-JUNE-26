package LEC23;

public class duplicatepermuntations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
per("aba", "");

	}
	public static void per(String q , String ans) {
		if(q.length()==0) {
			System.out.println(ans);
			return ;
		}
		
		
		boolean []freq = new boolean[26]	;
		for (int i = 0; i < q.length(); i++) {
		char ch=	q.charAt(i);
			if(freq[ch-97]==false) {
				freq[ch-97]=true;
				per(q.substring(0,i)+q.substring(i+1), ans+q.charAt(i));
			}
		
		}
	}

}
