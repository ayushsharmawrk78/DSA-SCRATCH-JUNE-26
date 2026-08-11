package LEC23;

public class MOVEINA2DARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][]arr = new int [4][4];
ans(arr, "", 0, 0);
	}
	
	public static void ans(int [][]arr , String ans , int row , int col) {
		if(row==arr.length-1&&col==arr[0].length-1) {
			System.out.println(ans);
			return;
		}
		
		if(row>arr.length-1||col>arr[0].length-1) {
		
			return;
		}
		
		
		
		
		ans(arr, ans+"H", row, col+1);
		ans(arr, ans+"V", row+1, col);
	}

}
