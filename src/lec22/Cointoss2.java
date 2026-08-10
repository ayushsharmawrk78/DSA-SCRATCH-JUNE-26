package lec22;

public class Cointoss2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cointoss2(3, "");
	}
	public static void cointoss2(int n,String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		if(ans.length()==0|| ans.charAt(ans.length()-1)!='H') {
			cointoss2(n-1, ans+"H");
		}

		cointoss2(n-1, ans+"T");
	}

}
