package lec12;

public class Twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][]arr = new int [5][4];
		
		int []arr2 = {1,2,2,3};
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		
//		System.out.println(arr[0][1]);
		
		int [][]arr3= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				
				
				
		};
		
		
		for (int i = 0; i < arr3.length; i++) {
			
			for (int j = 0; j < arr3[0].length; j++) {
				
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}

		
	}

	
	
}
