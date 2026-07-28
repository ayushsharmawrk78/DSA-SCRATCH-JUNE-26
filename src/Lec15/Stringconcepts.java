package Lec15;

public class Stringconcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int []arr = new int [26];
		
		String a = "abcbdabcx";
		
		
//		char m = 'a';
//		int n = m;
//		System.out.println(n);
		
		
		
		
		for (int i = 0; i < a.length(); i++) {
			
			char ch = a.charAt(i);// character
			
			int num = ch;// ascii
			
			int index = num-97; // index
			
			arr[index]=arr[index]+1;
			
		}
for (int i = 0; i < arr.length; i++) {
			
		char ch = (char)(i+97);

		System.out.println(ch  +"   ------> "+ arr[i]);
			
		}
		
	}

}
