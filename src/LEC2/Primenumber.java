package LEC2;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner in = new Scanner(System.in);
	
	int n = in.nextInt();
	
	int i =2;
	int factor =0;
	while(i<n) {
		
		if(n%i==0) {
			factor++;
	break;
		}
		System.out.println(i);
		i++;
	}
	
	
	if(factor>0) {
		System.out.println("NON PRIME");
	}else {
		System.out.println("PRIME");
	}
	}

}
