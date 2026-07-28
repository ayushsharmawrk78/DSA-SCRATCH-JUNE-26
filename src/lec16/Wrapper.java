package lec16;

import java.util.ArrayList;
import java.util.List;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a =10;


Integer b = 10;  // wrapper class


Byte c = 20;


Short z = 10;

Boolean u =true;



String m = u.getClass().getName()+" @ " + Integer.toHexString(System.identityHashCode(u));
System.out.println(m);
	}

}
