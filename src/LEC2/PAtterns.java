package LEC2;

import java.util.Scanner;

public class PAtterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int row =0;
		
		
//		while(row<n) {
//			
//			
//			int s =0;
//			while(s<space) {
//				System.out.print(" ");
//				s++;
//			}
//			
//			int st = 0;
//			while(st<star) {
//				System.out.print("* ");
//				st++;
//			}
//			
//			System.out.println();
//		    space+=4;	//space= space+2;
//		    star--;
//		    row++;
//		}
//		
//		
		
//		
//		while(row<n) {
//			
//			if(row==0||row==n-1) {
//				
//				
//				int st =0;
//				while(st<n) {
//					System.out.print("*");
//					st++;
//				}
//			}
//			
//
//			
//			
//			else {
//				int sp=0;
//				int st =0;
//				
//				System.out.print("*"); 
//				
//				while(sp<n-2) {
//					System.out.print(" ");
//					sp++;
//				}
//				
//				System.out.print("*"); 
//			
//		
//				
//			}
//			System.out.println();
//			row++;
//			
//			
//		}
		
		
//
//		int star = 1;
//		
//		
//		while(row<2*n-1) {
//			
//			int st=0;
//			
//			
//			while(st<star) {
//				System.out.print("* ");
//				st++;
//			}
//			
//			
//			if(row<n-1) {
//				star++;
//			}else {
//				star--;
//			}
//			
//			System.out.println();
//			row++;
//			
//			
//		}
//	}
//	
//	
		
		
//	
		
		
//		int star =1;
//		int num =1;
//		while(row<n) {
//			
//			
//			
//			int st =0;
//			while(st<star) {
//				System.out.print(num+" ");
//				st++;
//				
//			}
//			
//			
//			star++;
//			row++;
//			num++;
//			System.out.println();
//			
//		}
//		
		
//		int star =n;
//		int space =0;
//		row=1;
//		while(row<=2*n-1) {
//			
//			int sp = 0;
//			while(sp<space) {
//				System.out.print("  ");
//				sp++;
//				
//			}
//			
//			
//			
//			int st =0;
//			while(st<star) {
//				System.out.print("* ");
//				st++;
//			}
//			
//			
//			
//			
//			if(row<n) {
//				space+=2;
//				star--;
//			}else {
//				space-=2;
//				star++;
//			}System.out.println();
//			row++;
//		}
		
		
		
		int star =1;
		int space =n-1;
		int num=1;
		
		while(row<n) {
			
			
			int sp=0;
			while(sp<space) {
				System.out.print("  ");
				sp++;
			}
			
			int st =0;
			int val=num;
			while(st<star ) {
				System.out.print(val+ " ");
			
				if(st<(star/2)) {
					val++;
				}else {
					val--;
				}
				
				st++;
				
			}
			
			
			row++;
			space--;
			star+=2;
			num++;
			System.out.println();
			
		}
	}
}
