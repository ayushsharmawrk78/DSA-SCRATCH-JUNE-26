package LEC5;

public class Functionflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
fun(2);

fun3(15);
	}
	
	
	
	public static int fun(int a ) {
		
		fun2(4);
		return 1;
	
	}
	
public static int fun2(int d) {
		
	
	return d+1;
	
	}
public static int fun3(int b) {
	
	
	int m = b+fun2(8);
	
	fun4(9);
	return m;
}
public static int fun4(int c) {
	
	return c;
	
	
}

}
