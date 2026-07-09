package Lec8;

public class DNF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {1,1,0,1,0,1,2,2,0,2};
DNF(arr);
for (int i = 0; i < arr.length; i++) {
	System.out.print(arr[i]+" ");
}
	}
	
	
	public static void DNF(int []arr) {
		
		
		int  i  =0;// 0 ki start
		int  j = arr.length-1;//2 ke liye
		
		int k = 0 ;// traversal
		
		while(k<=j) {
			
			if(arr[k]==0) {
				int temp = arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
				i++;
				k++;
			}
			else if (arr[k]==2) {
				int temp = arr[j];
				arr[j]=arr[k];
				arr[k]=temp;
				j--;
				// k plus nhi karunga kyunki  mujhe ye nhi pta aage se kya element aaya hain
			}
			else {
				k++;
			}
			
			
		}
		
	}

}
