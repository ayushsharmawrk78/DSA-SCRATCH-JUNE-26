package Lec30;

import java.util.Arrays;

public class partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {5,7,2,3,1,12,6,4};
System.out.println(Arrays.toString(partition(arr)));
	}
	
	
	
	
	public static int[] partition(int []arr) {
		
		
		int si=0;
		int ei =arr.length-1;
		
		int pi =si;
		
		int item = arr[ei];
		
		
		for (int i = si; i < ei; i++) {
			
			
			if(arr[i]<item) {
				swap(arr, i , pi);
				pi++;
			}
		}
		
		
		swap(arr, pi, ei);
		return arr;
	}
	
	public static  void swap(int []arr , int i , int j) {
		
		
		
		int temp =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
