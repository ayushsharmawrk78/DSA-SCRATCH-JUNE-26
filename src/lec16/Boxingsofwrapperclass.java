package lec16;

public class Boxingsofwrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int a =10; //primitive data type
//
//Integer m =a; // non primitive data type
//
//System.out.println(m);
//// autoboxing 
//
//
//// unboxing
//
//Integer z =10;
//
//int f = z;
//
		
		
		
		Integer  m =10;//2k  ---> unbox int m =10;
		Integer z = 20;//3k ---> unbox int z =20;--->  ;
		Integer o = m+z;//2k+3k---> Integer o = Integer.valueof(m+z); //autoboxing
		System.out.println(o);



for (Integer i = 0; i <10; i++) {
	System.out.println(i);
}

for (int i = 0; i < 10; i++) {
	System.out.println(i);
}
	}
	
	

}
