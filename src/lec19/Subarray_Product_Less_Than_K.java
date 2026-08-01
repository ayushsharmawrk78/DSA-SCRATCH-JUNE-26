package lec19;

public class Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {10,5,2,6};

	}
	
	public static int ans(int []arr , int product) {
		
		int ans =0;
		int pi =1;
		int si=0;
		int ei =0;
		while(ei<arr.length) {
			// window grow
			pi = pi*arr[ei];
			
			// shrink
			while(si<=ei && pi>=product) {
				
				pi = pi/arr[si];
				si++;
			}
			
			// ans calculate
			
			ans = ans+(ei-si)+1;
			ei++;
		
		}
		return ans;
	}

}
