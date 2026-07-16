package LEC14;

public class Stringssss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr = {1,2,3};
		
		arr[0]= 10;
		
		
	
		
		String s = "hello";//5k
		String n ="hello";
//		System.out.println(s==n);
		
		
		s= s+"world";
		
		
//		System.out.println(s==n);
		
		System.out.println(ispalindrome("hello"));
		
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
