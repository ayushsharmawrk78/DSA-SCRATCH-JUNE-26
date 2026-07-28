package Lec17;

public class Pairsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {10,12,14,15,19,21};
System.out.println(pairsum(arr, 30));
}
	
	
	public static boolean pairsum(int []arr , int target) {
		int i =0;
		int j =arr.length-1;
		
		while(i<j) {
			if(arr[i]+arr[j]==target) {
				return true;
			}else if((arr[i]+arr[j])>target) {
				j--;
			}else {
				i++;
			}
		}
		return false;
	}

}
