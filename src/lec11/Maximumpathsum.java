package lec11;

public class Maximumpathsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int sumpath(int []arr , int []brr) {
		
		int i =0;//arr
		int j =0;// brr
		int p =0;// arr start  last swap path changing index
	int m = 0;// brr start last swap  path changing index
		int ans =0;
		
	
	while(i<arr.length&& j <brr.length) {
		
		if(arr[i]<brr[j]) {
			i++;
		}else if (arr[i]>brr[j]) {
			j++;
		}else {
			int sum1 = 0;
			int sum2 =0;
			for (int k = p; k <=i; k++) {
				sum1 = sum1+arr[k];
			}
			
			
			for (int k = m; k <=j; k++) {
				sum1 = sum1+brr[j];
			}
			ans = ans+Math.max(sum1, sum2);
			i++;
			j++;
			p=i;
			m=j;
			
			
		}
		
		
	}
	if(i==arr.length)
	{
		
		for (int k = m; k < brr.length; k++) {
			ans = ans+brr[k];
		}
	}else if(j==brr.length) {
		for (int k = p; k < arr.length; k++) {
			ans = ans+arr[k];
		}
	}
		
		return ans;
		
	}
	

}
