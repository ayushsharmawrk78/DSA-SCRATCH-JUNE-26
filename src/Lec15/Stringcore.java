package Lec15;

public class Stringcore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a ="hello";
		String m = "hello";
		
		String z = new String ("hello");
		
		String addressofa = a.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(a));

		String addressofm = m.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(m));

		String addressofz = z.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(z));
		
		String addressofz1 = z.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(z.intern()));
		
		System.out.println(addressofa);
		System.out.println(addressofm);
		System.out.println(addressofz);
		System.out.println(addressofz1);
	}

}
