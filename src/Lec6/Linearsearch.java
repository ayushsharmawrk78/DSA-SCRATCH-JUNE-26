package Lec6;

public class Linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr  = {10,20,30,40,50};
System.out.println(linearsearch(arr, 300));

	}
public static int linearsearch(int []arr , int target) {
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]==target) {
			return i;
		}
	}
	
	return -1;
}


}