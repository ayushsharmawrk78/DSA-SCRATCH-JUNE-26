package Lec17;

public class Majourityelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int []arr = {2,1,2,3,2,2,2,1,2,1,3,4};
//System.out.println(majourity(arr));




	}
	
	
	public static int majourity(int []arr) {
		int freq=0;
		int maj =arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==maj) {
				freq++;
			}else if(freq==0) {
				maj= arr[i];
		
			
			}else {
				freq--;
			}
		}
		return maj;
	}

}
