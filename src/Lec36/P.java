package Lec36;

public  class P {
	
	
     private int a =10;


    int n  =20; // deafult -- same  class , same package 
    
    public int z = 40;  // all
    
  protected int s2 =10;
    
    
    
    
	static int s= 20;
	static {
		System.out.println("hello i am in static block");
	}
	
	final int m =20;// all time constant 
	
	public void fun() {
	// 	m =30;//wrong
	}
	public final void fun2() {
		// 	m =30;//wrong
		}
	
	
}
