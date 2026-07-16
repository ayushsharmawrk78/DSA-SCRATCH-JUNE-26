package LEC14;

public class Stringconcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		String m = "hello"; //tostring method 
//		
int []arr = {1,2,3};
//int a =arr.length;
//		
//		System.out.println(arr);
//		
//		System.out.println(m);
		
		
		String m = "nitin";

		
		System.out.println(m.length());
		
		System.out.println(m.charAt(1));
		
		System.out.println(m.toUpperCase());
		
		for (int i = 0; i < m.length(); i++) {
			
			for (int j = i+1; j <=m.length(); j++) {
				System.out.println(m.substring(i,j));
			}
		}
		
	}
public static boolean ispalindrome(String s) {
		
		int i =0;
		int j =s.length()-1;
		
		while(i<=j) {
			if(s.charAt(i)==s.charAt(j)) {
				i++;
				j--;
			}else {
				return false;
			}
		}
		
		return true;
	}
}
