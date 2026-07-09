package LEC3;

import java.util.Scanner;

public class NUMBERGAME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		
//		
//		int sod =0;
//		while(n!=0) {
//			int rem = n%10;
//			
//			sod= sod+rem;
//			n=n/10;
//		}
//		System.out.println(sod);
//		
//		int i=0;
//		
//		while(i<=5) {
//			
//			
//			System.out.println("hello");
//		
//			if(i==3) {
//				i++;
//		continue;
//			}
//			
//			System.out.println(i);
//			i++;
//		}
		
//		int n = in.nextInt();
//		int count =0;
//		int a =n;
//		
//		while(n!=0) {
//		int rem = n%10;
//		
//	count++;
//			n=n/10;
//		}
//		
//		n=a;
//		int sum =0;
//		while(n!=0) {
//			int rem = n%10;
//			
//	sum = (int) (sum+Math.pow(rem, count));
//	
//				n=n/10;
//			}
//		
//		if(a==sum) {
//			System.out.println("YES");
//		}else {
//			System.out.println("NO");
//		}
//		
		
//	
//		
//		for (int i = 0; i < 0; i++) {
//			System.out.println("hello");
//		}
//		
//		
//		
//		int i =0;
//		do {
//			
//			System.out.println("hello");
//			i++;
//		} while (i<0);

		
//		int n  =in.nextInt();
//		int a =0;
//		int b =1;
//		int i =1;
//		
//		while(i<n) {
//			
//			int c = a+b;
//			a = b;
//			b =c;
//			i++;
//			
//		}
//		System.out.println(b);
		
		
		int a =10;
		int b =a++;// post operator --> kaam hone ke baad assign hota hain
		
	int c = ++a; // pre operatore --> kaam hone se pehel assign 
	System.out.println(c);
		System.out.println(b);
b =a;
System.out.println(b);
//		System.out.println(a++);//10
//		
//		System.out.println(a++);//11
//		
//		System.out.println(++a);// 13
	}

}
