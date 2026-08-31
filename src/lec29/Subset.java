package lec29;

import java.util.ArrayList;
import java.util.List;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>ll = new ArrayList<>();
		List<List<Integer>>an = new ArrayList<>();
int []arr = {1,2,3};
subset(arr, 0, "", ll,an);
System.out.println(an);
	}
 // subset  ,subset 2 ,  coin change , subsequnce , cc2 , permuntaions ,permiunations 2 , combination 1 ,2 ,3
	
	
	public static void subset(int []arr  ,int start , String ans,List<Integer>ll,		List<List<Integer>>an) {
		
		
		
//		System.out.println(ll);
		
		an.add(new ArrayList<>(ll));
		
		
		
		// replica
		for (int i = start; i < arr.length; i++) {
			ll.add(arr[i]);
			subset(arr, i+1, ans+arr[i],ll,an);
			ll.remove(ll.size()-1); // backtracking
		}
	}
	
	
	
	
//public static void subset2(int []arr  ,int i , String ans) {
//		
//		if(i==arr.length) {
//			System.out.println(ans);
//			return;
//		}
//	
//	
//	
//	
//		subset2(arr, i+1, ans+"");
//		subset2(arr, i+1, ans+arr[i]);
//		
//	}
}
