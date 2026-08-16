package Lec24;

import java.util.ArrayList;
import java.util.List;

public class Keypad {
	static String[] key = { "","", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz" };
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public  static List<String> letterCombinations(String digits) {
        List<String>ll =new ArrayList<>();
        keypad(digits, "",ll);
        return ll;
    }
	
	public static void keypad(String q , String ans,   List<String>ll) {
		if(q.length()==0) {
	ll.add(ans);
			return;
		}
		
	 int index = (int )(q.charAt(0)) -48;
	String keypress = key[index];
	for (int i = 0; i < keypress.length(); i++) {
		keypad(q.substring(1), ans+keypress.charAt(i),ll);
	}
		
		
	}

}
