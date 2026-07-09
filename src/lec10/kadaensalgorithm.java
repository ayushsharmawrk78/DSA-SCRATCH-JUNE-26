package lec10;

public class kadaensalgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {5,2,-8,3,-4,10};
System.out.println(kadaens(arr));
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
