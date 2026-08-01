package lec19;

public class Fixedslidingwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {2,10,8,7,1,6,4};
System.out.println(fixed(arr, 3, 15));
	}
	
	public static int fixed(int []arr , int  k , int sum ) {
		
		
		// window build of size k
		int ans =0;
		int csum=0;
		for (int i = 0; i < k; i++) {
			csum = csum+arr[i];
		}
		
		if(csum >=sum) {
			ans++;
		}
		// window slide
		for (int i = k; i < arr.length; i++) {
			csum =arr[i]+csum;
			csum = csum-arr[i-k];
			if(csum>=sum) {
				ans++;
			}
		}
		
		return ans;
	}

}
