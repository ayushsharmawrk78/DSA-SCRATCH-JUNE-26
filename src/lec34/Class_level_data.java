package lec34;

public class Class_level_data {

	
	
	public static void main(String[] args) {
//		Demo d = new Demo();
//		Demo d1 = new Demo();
//		
////		System.out.println(d.var);//10
////		d.var=30;
////		System.out.println(d.var);//30
////		
////		System.out.println(d1.var);//10
//	
//		System.out.println(d.var2);
//		
//		
//		d.var2=100;
//		
//		System.out.println(d.var2);
//		System.out.println(d1.var2);
		
		
//		Demo.var2=20;
//		System.out.println(Demo.var2);// class level data 
		
		
		Demo d = new Demo();
		
		d.var=100;
		Demo d1 = new Demo();
		
		d1.var=200;
		d.fun();
		
		d1.fun();
		
	}
	
	
	

}
