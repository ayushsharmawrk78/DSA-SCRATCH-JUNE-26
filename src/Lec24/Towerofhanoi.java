package Lec24;

public class Towerofhanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TOH(3, "A", "B", "C");
	}
	public static void TOH(int n , String src , String hlp , String des) {
		
		if(n==0) {
			return ;
		}
		
	
		
		TOH(n-1,src ,des, hlp); //call
		System.out.println(" MOVE "+n +" th disc from "+src+" to "+des);
		TOH(n-1,hlp ,src, des); //call
	}

}
