package lec22;

public class Boardpath {

	public static void main(String[] args) {
		boardpath(0, 4, "",3);
		
		
//		int i =0;
//		System.out.println("hello"+i);
//		i++;
//		System.out.println("hello"+i);
//		i++;
//		System.out.println("hello"+i);
		
	}
	public static void boardpath(int curr , int target , String ans ,int n) {
		
		if(curr==target) {
			System.out.println(ans);
			return;
		}
		if(curr> target) {

			return;
		}
		
		
//		boardpath(curr+1, target, ans+1);
//		boardpath(curr+2, target, ans+2);
//		boardpath(curr+3, target, ans+3);
		for (int i = 1; i <=3; i++) {
			boardpath(curr+i, target, ans+i,n);
		}
	}
	
	

}
