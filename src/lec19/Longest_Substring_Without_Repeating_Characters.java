package lec19;

public class Longest_Substring_Without_Repeating_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "abcabcbb";
System.out.println(Longest_Substring(s));
		
	}
	public static int Longest_Substring(String s) {
		int ans =0;
		int curr =0;
		int []freq = new int [26];
		int si=0;
		int ei =0;
		while(ei<s.length()) {
			// grow
			int idx = s.charAt(ei)-97;
			freq[idx]++;
			// shrink
			while(si<ei && freq[idx]>1) {
				int index = s.charAt(si)-97;
				freq[index]--;
				si++;
			}
			
			// ans calcuate
			curr = (ei-si)+1;
			ans = Math.max(ans, curr);
			ei++;
			
			
		}
		return ans;
	}

}
