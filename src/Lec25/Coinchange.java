package Lec25;

public class Coinchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {1,2,3,5};
coinchange(arr, 0, 5, "");
	}
	public static void coinchange(int []arr , int cs , int target ,String ans ) {
		
		if(cs==target) {
			System.out.println(ans);
			return;
		}
		if(cs>target) {

			return;
		}
	
		
		for (int j = 0; j < arr.length; j++) {
			coinchange(arr, cs+arr[j], target, ans+arr[j] );
		}
	}

}
