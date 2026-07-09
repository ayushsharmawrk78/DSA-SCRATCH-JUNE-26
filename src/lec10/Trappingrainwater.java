package lec10;

public class Trappingrainwater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {5,2,1,6,11,4,3,8};
System.out.println(trap(arr));
	}
	
	public static int trap(int []arr) {
		
		int []leftmax = new int [arr.length];
		
		
		int []rightmax = new int [arr.length];
		
		
		leftmax[0]=arr[0];
		
		for (int i = 1; i < leftmax.length; i++) {
			leftmax[i]=Math.max(leftmax[i-1], arr[i]);
		}
		
		rightmax[rightmax.length-1]=arr[arr.length-1];
		
		for (int i = rightmax.length-2; i>=0; i--) {
			rightmax[i]=Math.max(rightmax[i+1], arr[i]);
		}
		
		int sum =0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum+ Math.min(leftmax[i], rightmax[i])-arr[i];
			
		}
		return sum;
		
		
		
	}

}
