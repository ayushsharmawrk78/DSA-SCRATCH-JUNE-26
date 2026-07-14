package lec13;

public class Maximumcircularsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {2,5,-10,3,-8,14,12};
System.out.println(maxcsum(arr));
	}
	
	public static int maxcsum(int []arr) {
		
		
		int normal = kadaens(arr);
		
		int tsum =0;
		for (int i = 0; i < arr.length; i++) {
			tsum= arr[i]+tsum;
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=-1*arr[i];
		}
		
		
		int negativekkd = kadaens(arr);
		
		
		int circular = tsum +negativekkd;

		
		return Math.max(circular, normal);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	public static int kadaens(int []arr)
	{
		
		
		int max =Integer.MIN_VALUE;
		int sum =0;
		int i =0;
		
		while(i<arr.length) {
			sum = sum+arr[i];
			
			
			max = Math.max(sum, max);
			
			if(sum<0) {
				sum =0;
			}
			
			i++;
			
		}
		
	return max;
	}
}
