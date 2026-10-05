package Lec41;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int a = in.nextInt();
//		long b = in.nextLong();
//		
//System.out.println("hello");
//
//
//int m = 10;
//int d = 40;
//int n1 = m+d;
//System.out.println(m+d);
		
//		
//		for (int i = 0; i < n; i++) {
//			System.out.println(i);
//			
//			//O(n)
//		}
//
//		
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				System.out.println(i);
//			}
//			
//		}
//		// O (N2)
//	}
//	
		
		int n = 10000000;
	
			
			
			int i = 0;
			while (i < n) {
				System.out.println("Hey");
				
				i++;
				
				//o(n)
			}

			while (i < n) {
				System.out.println("Hey");
		
				i *= 2;
				
				// logn
			}

			
			
			while (n > 0) {
				System.out.println("Hey");
			
				n /= 2;
				//logn
			}

			while (i <= n) {
				System.out.println("Hey");

				i += 2;
				i += 3;
				// n
			}

			while (i <= n) {
				System.out.println("Hey");
				
				i *= 2;
				i *= 3;
				
				// logn base 6
			}

			while (n > 0) {
				System.out.println("Hey");
		
				n /= 2;
				n /= 3;
				
				// logn base 6
			}

			int k = 10;
			
			
			
			
			while (i <= n) {
				System.out.println("Hey");
			
				i += k;
				
				//n/k
			}

			while (i <= n) {
				System.out.println("Hey");
				
				i *= k;
				
				// log n basek
			}

			while (n > 0) {
				System.out.println("Hey");

				n = n - 1;
				
				// n
			}
			while (n > 0) {
				System.out.println("Hey");

				n = n - 2;
				n = n - 3;
				
				//n
			}
			while (n > 0) {
				n = n - k;
				
				// n/k
			}

			for (i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					System.out.println("hey");

					// O(N^2)
				}
			}

			
			
			for (i = 1; i * i <= n; i++) {
				System.out.println("hey");
			//rootn
			}
			
			
			
			

			for (i = 1; i <= n; i++) {
				for (int j = 1; j <= i * i; j++) {
					for (k = 1; k <= n / 2; k++) {
						System.out.println("hey");
						
					}
				}
			}
			// n4

			for (i = 1; i <= n; i *= 2) {
				System.out.println("hey");
				
				// logn
			
			}

			for (i = n / 2; i <= n; i++) {
				for (int j = 1; j <= n / 2; j++) {
					for ( k = 1; k <= n; k = k * 2) {
						System.out.println("hey");
						//n2logn
					}
				}
			}

			for (i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j += i) {
					System.out.println("hey");
					
				}
			}
			
			// n logn
			
			int val = 1000;
			for (i = 0; i < n; i++) {
				for (int j = 0; j < val; j++) {
					for (int t = 0; t <=j; t++) {
	                //(O) N*(Val)^2
					}
				}
			}
			  // bubble
			// Selection
			// instersion
			     
		}

}
