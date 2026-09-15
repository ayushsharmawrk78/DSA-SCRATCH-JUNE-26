package Lec36;

public class Child extends Parent {
	int a =20;
	@Override
public void fun() {
		System.out.println("hello i am in fun of c");
	}
public static void fun2() {
		System.out.println("hello i am in fun2 of c");
	}//method hiding
}
