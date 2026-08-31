package Lec30;

import java.util.Arrays;

public class Mergetwosortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr1 = {1,2,4,6,7,9,10};
int []arr2 = {3,8,9,12,14,16,18,19};
System.out.println(Arrays.toString(mergetwo(arr1, arr2)));
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
