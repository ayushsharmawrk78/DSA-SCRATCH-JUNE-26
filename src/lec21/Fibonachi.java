package lec21;

public class Fibonachi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(fibo(5));
	}
	
	public static int fibo(int n) {
		if(n==0||n==1) {
			return n;
		}
		
		//2
		int f1 = fibo(n-1);
		int f2 = fibo(n-2);
		return f1+f2;
	}

}
