package lec18;

public class Typecastingintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer m = 066;
//int  a = 037;// 0-7
//System.out.println(m);


byte b = (byte )(140);
System.out.println(b);



byte a =123;
byte c = 20;

byte d = (byte) (a+c);
System.out.println(d);


byte m1 = 20;
m1 = (byte )(m1+1);

//short s = 12;
short s1 =12;

s1 +=2;//s1 = (short) (s1+2);

byte c1 =10;

c1 +=9;//c1 = (byte) (c1+2);


byte d1 =127;


d1++; // d1 =(byte)(d1+1);
System.out.println(d1);
	}

}
