package Lec6;

public class REVERSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {10,20,30,40,50};



for (int j2 = 0; j2 < arr.length; j2++) {
	System.out.print(arr[j2]+"  ");
}
	}

	
	
	public static void reverse(int []arr , int i , int j) {
		

		while(i<=j) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			i++;
			j--;
		}
	}
}
