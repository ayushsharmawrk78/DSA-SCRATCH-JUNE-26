package Lec8;

public class Selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {5,3,-7,4,8,2};
selectionsort(arr);

for (int i = 0; i < arr.length; i++) {
	System.out.print(arr[i]+" ");
}
}
	
	public static void selectionsort(int []arr) {
		
		
		for (int i = 0; i < arr.length; i++) {
			
			int mini =i;
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[j]<arr[mini]) {
					mini = j;
					
				}
			}
			
			int temp = arr[mini];
			arr[mini]=arr[i];
			arr[i]=temp;
			
			
			
			
			
		}
		
	
	}

}
