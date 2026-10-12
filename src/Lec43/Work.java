package Lec43;

public interface Work {
	
// public static final	int  a=10; ==
	 int a =10;
	
	 default void nonabstract() {
		// a=20; bydefault java interface mein data memebers are final
	 }
	
	
	public  void push();
	
	public int  peek();
	
	private void pvt() {
		//java 9
	}
	
	
	public static void fun() {
		
	}
}
