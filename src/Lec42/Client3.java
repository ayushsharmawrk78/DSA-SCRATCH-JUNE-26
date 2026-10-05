package Lec42;

public class Client3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractClassDemo obj = new AbstractClassDemo() {
			
			@Override
			public void fun2() {
				// TODO Auto-generated method stub
				
			}
		};
AbstractClassDemo obj1 = new AbstractClassDemo() {
			
			@Override
			public void fun2() {
				// TODO Auto-generated method stub
				
			}
		};
		
//		Dog d = new Dog()
//;
//		System.out.println(d.getClass());
		System.out.println(obj.getClass());
			

		System.out.println(obj1.getClass());
}
}