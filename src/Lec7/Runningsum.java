package Lec7;

public class Runningsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {10,2,3,407,580};



running(arr);

for (int i = 0; i < arr.length; i++) {
	System.out.print(arr[i]+" ");
}
	}
	
	public static void running(int []arr) {
		
		for (int i = 1; i < arr.length; i++) {
			arr[i]=arr[i-1]+arr[i];
		}
	}

}
