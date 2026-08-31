package Lec30;

public class quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void sort(int[]arr , int si , int ei) {
		
		if(si>=ei) {
			return;
		}
		
		//pivot is always last
		int pi = partition(arr,si,ei);
		sort(arr,si,pi-1);
		sort(arr,pi+1,ei);
		
	}
	
public static int partition(int []arr  , int si , int ei) {
		
		
		
		
		int pi =si;
		
		int item = arr[ei];
		
		
		for (int i = si; i < ei; i++) {
			
			
			if(arr[i]<item) {
				swap(arr, i , pi);
				pi++;
			}
		}
		
		
		swap(arr, pi, ei);
		return pi;
	}


public static  void swap(int []arr , int i , int j) {
	
	
	
	int temp =arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}

}
