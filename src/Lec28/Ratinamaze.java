package Lec28;

import java.util.Arrays;
import java.util.Scanner;

public class Ratinamaze {

	public static void main(String[] args) {

		Scanner in  = new Scanner(System.in);
		int row = in.nextInt();
		int col = in.nextInt();
		// TODO Auto-generated method stub
		char[][]arr=new char[row][col];
		for (int i = 0; i < arr.length; i++) {
			String a = in.next();
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]=a.charAt(j);
			}
		}
		int[][]arr2=new int[row][col];
rat(arr, 0, 0, arr2);
	}
	
	
	public static void rat(char[][]arr , int cr , int cc , int [][]ans) {
		
		if(cr<0||cc<0||cr>=arr.length||cc>=arr[0].length) {
			return;
		}
		if(cr==arr.length-1&&cc==arr[0].length-1&& arr[cr][cc]!='X') {
			ans[cr][cc]=1;
			System.out.println(cr);
			Display(ans);
			System.out.println();
			return;
		}
		
		
		
		
		if(arr[cr][cc]=='X') {
			return;
		}
		
		ans[cr][cc]=1;
		arr[cr][cc]='X';

		
		rat(arr, cr, cc+1,ans);
		rat(arr, cr, cc-1,ans);
		rat(arr, cr+1, cc,ans);
		rat(arr, cr-1, cc,ans);
		
		
		arr[cr][cc]='O';
		ans[cr][cc]=0;
		
	}


	private static void Display(int[][]ans) {
	for (int i = 0; i < ans.length; i++) {
		for (int j = 0; j < ans[0].length; j++) {
			System.out.print(ans[i][j]+" ");
		}System.out.println();
	}
	}

}
