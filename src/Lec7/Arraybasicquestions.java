package Lec7;

public class Arraybasicquestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {-10,-20,-30,-40,-50};
System.out.println(min(arr));
	}
	
	public static int max (int []arr) {
		int maxi = Integer.MIN_VALUE;// minus infinty // smallest value of integer which exist in java 
		
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>maxi) {
				maxi = arr[i];
			}
		}
		return  maxi;
	}
	
	public static int min (int []arr) {
		int maxi = Integer.MAX_VALUE;// plus infinty // largest  value of integer which exist in java 
		
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<maxi) {
				maxi = arr[i];
			}
		}
		return  maxi;
	}
	
	
	

}
