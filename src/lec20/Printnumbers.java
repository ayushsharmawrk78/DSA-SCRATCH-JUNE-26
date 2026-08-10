package lec20;

public class Printnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
print2(5);
	}
public static void print(int n) {
	
	if(n==0) {
		return;
	}
	
	System.out.println(n);
	print(n-1);
}
public static void print2(int n) {
	
	if(n==0) {
		return;
	}
	print2(n-1);
	System.out.println(n);

}
}
