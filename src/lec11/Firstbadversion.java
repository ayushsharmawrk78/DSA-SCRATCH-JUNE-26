package lec11;

public class Firstbadversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static int firstbad(int n) {
		int si=1;
		int ei =n;
		int ans = 0;
		
		while(si<=ei) {
			int mid  = (si+ei)/2;
			
			
			if(isBadVersion(mid)==true) {
				ans = mid;
				ei=mid-1;
			}
			else {
				si=mid+1;
			}
		}
		return ans;
	}


	private static boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}

}
