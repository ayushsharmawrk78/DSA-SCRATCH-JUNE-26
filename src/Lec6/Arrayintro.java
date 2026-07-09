package Lec6;

import java.util.Scanner;

public class Arrayintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int a =10;
//int b =20;
		
		// homogeneous data
		
//		int []arr = new int [8];
//		
//		System.out.println(arr);
//
//		
//		 System.out.println(arr[0]);
//		 System.out.println(arr[1]);
//[I@7ad041f3
		
//		
//		int a =20;
//		int b =30;
//		System.out.println(a +"    "+ b);
//		fun(a, b);
//		System.out.println(a +"    "+ b);
		
		// int [] arr = {1,2,2,3,4,};
		
		int []arr = new int [5];
//		
//		arr[0]=10;
//		arr[1]=20;
//		arr[2]=30;
//		arr[3]=40;
//		arr[4]=50;
//		
		
		Scanner in = new Scanner(System.in);
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=in.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		//System.out.println(arr[0]+"   "+arr[1]);
		
	//swap(arr);
		
		//System.out.println(arr[0]+"   "+arr[1]);
		
		
		
	}
	
	public static void fun(int a , int b) {
		
		
		int temp = a;
		a = b;
		b = temp;
		

		
	}
	
	public static void swap(int []arr) {
		int temp = arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
	}
	
	
	
	
	
	
	
	
//	public static void fun(int a , int b) {
//		
//		int temp = a;
//		a= b;
//		b = temp;
//	}

}
