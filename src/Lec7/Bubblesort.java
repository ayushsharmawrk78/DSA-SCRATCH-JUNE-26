package Lec7;

import java.util.Iterator;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {5,3,-7,4,8,2};
bubblesort(arr);
for (int i = 0; i < arr.length; i++) {
	
	System.out.print(arr[i]+ " ");
}
	}
	public static void bubblesort(int []arr) {
		
		boolean flag = false;
		// modified bubble sort  10 20 30 40 50 
		
		
		for (int turn = 1; turn < arr.length; turn++) {
			

			for (int j = 0; j <arr.length-turn; j++) {
				
				
				if(arr[j]>arr[j+1]) {
					
					flag = true;
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
				
			}
			if(flag==false) {
				return;
			}
			flag = false;
			
		}
	}

}
