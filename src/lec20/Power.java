package lec20;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(pow(5, 3));
	}

	public static int pow(int n , int a ) {
		
		if(a==0) {
			return 1;
		}
		
		int prev = pow(n , a-1);
		return prev*n;
		
		
	}
}
