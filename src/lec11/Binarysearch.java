package lec11;

public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr = {10,23,45,65,76,82,91,100};
		System.out.println(binarysearch(arr, 911));
	}
	
	
	public static int binarysearch(int []arr , int target) {
		
		
		int si =0;
		int ei =arr.length-1;
		
		while(si<=ei) {
	int mid = (si+ei)/2;
	
	if(arr[mid]==target) {
		return mid;
	}
	
	else if(arr[mid]>target) {
		ei = mid-1;
	}
	else {
		si = mid+1;
	}
	
	

			
			
		}
		return -1;
		
	}

}
