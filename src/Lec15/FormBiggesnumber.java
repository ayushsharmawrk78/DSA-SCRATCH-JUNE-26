package Lec15;

public class FormBiggesnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		
//		String s ="123";
//		int m = Integer.parseInt(s);
//		int n = 4;
//		System.out.println(m+n);
				
				
	}
	
	public static void bubblesort(int []arr ) {
		
		
		for (int turn = 1; turn <arr.length; turn++) {
			
			for (int i = 0; i < arr.length-turn; i++) {
				
				
				if(check(arr[i],arr[i+1] )) {
					
					int temp =arr[i]
							;
					
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			
		}
		
		
	}
	
	
	public static boolean check(int a , int b) {
		
		String m = ""+a+b;//5460
		String n = ""+b+a;//6054
		
		
		if(Integer.parseInt(n)>Integer.parseInt(m)) {
			return true;
		}
		
		return false;
	}

}
