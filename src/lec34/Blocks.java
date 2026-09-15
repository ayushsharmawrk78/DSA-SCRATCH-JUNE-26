package lec34;

public class Blocks {

	
	
	static int m = 20;
	
	int n = 100;
	
	static {
		m+=20;
	}
	
	{ // instance instatiation block
		
m = m+10;
n= n+30;
System.out.println(m);
		
	}
	
	
	public Blocks() {

		m = m+20;
		n=n+100;
		System.out.println(n);
	}
	


}
