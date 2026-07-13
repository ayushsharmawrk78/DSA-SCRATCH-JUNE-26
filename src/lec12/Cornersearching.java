package lec12;

public class Cornersearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				
				
				
		};
		System.out.println(search(arr, 90));
	}
	
	
public static boolean search (int [][]arr ,int target) {
	int row= 0;
	int col =arr[0].length-1;
	
	
	while(row<arr.length && col>=0) {
		if(arr[row][col]==target) {
			return true;
		}else if (arr[row][col]>target) {
			col--;
		}else {
			row++;
		}
		
	}
	return false;
}

}
