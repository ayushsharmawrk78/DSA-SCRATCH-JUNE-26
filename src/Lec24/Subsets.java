package Lec24;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {1,2,3};
subset(arr, 0, "",0,3);
	}
	
	public static void subset(int []arr  , int i , String ans , int sum  ,int target) {
		
		if(i==arr.length) {
			if(sum==target) {
				System.out.println("["+ ans+"]");
			}
	
			return;
		}
		
		
		subset(arr, i+1, ans+" " ,sum+0,target);//immutable
		subset(arr, i+1, ans+arr[i]+"" ,sum+arr[i] , target);
		
		
		
		
	}

}
