package lec10;

public class Maximumsubaraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {5,2,1,3,4};

	}
	
	public static int maxsum(int []arr) {
		
		int sum =0;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			sum =0;
			
			for (int j = i; j < arr.length; j++) {
				sum = sum+arr[j];
				max = Math.max(max, sum);
			}
		}
		return max;
	}

}
