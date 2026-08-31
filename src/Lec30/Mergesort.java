package Lec30;

import java.util.Arrays;

public class Mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {5,10,3,1,12,4};

System.out.println(Arrays.toString(sort(arr, 0, arr.length-1)));
	}
	
	public static int [] sort(int []arr , int si , int ei) {
		
		if(si==ei) {
			int []sarr = new int [1];
			sarr[0]=arr[si]
;
			return sarr;
			}
		int mid =(si+ei)/2;
		
	int []lft = sort(arr, si, mid);
	
	int []rt = sort(arr, mid+1, ei);
	
	
		return mergetwo(lft,rt);
		
	}
	public static int[] mergetwo(int []arr1 ,int []arr2) {
		int []ans = new int [arr1.length+arr2.length];
		
		int i=0;//arr1 pointer;
		int j =0;//arr2 pointer
		
		int k =0;//ans pointer

		
		while(i<arr1.length&&j<arr2.length) {
			
			if(arr1[i]<arr2[j]) {
				ans[k]=arr1[i];
				k++;
				i++;
			}else {
				ans[k]=arr2[j];
				k++;
				j++;
			}
		}
		while(i<arr1.length) {
			ans[k]=arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length) {
			ans[k]=arr2[j];
			k++;
			j++;
		}
		return ans;
		
		
		
		
		
	}

}
