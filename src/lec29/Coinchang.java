package lec29;

public class Coinchang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {1,2,3};

coinchange(arr, 0, 6,"",0);
	}

	
	public static void coinchange(int []arr , int cs  , int target, String ans ,int start) {
		
		
		System.out.println(ans);
		if(cs==target) {
			//System.out.println(ans);
			return;
			
		}
		
		if(cs>target) {
			return ;
		}
		
		for (int i = start; i < arr.length; i++) {
			
			coinchange(arr, cs+arr[i], target, ans+arr[i],i+1);
		}
		
	}
}
