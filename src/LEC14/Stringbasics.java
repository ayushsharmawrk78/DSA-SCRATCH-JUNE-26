package LEC14;

public class Stringbasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//	int[]arr = new int [5];
	int []arr = {1,2,3}; // literals
	
	
	int []arr2 = {1,2,3};
	//System.out.println(1==1);
	//System.out.println(arr==arr2);
	
//	String s ="hello";// literals
//	String s1 ="hello2";
//	
//	
//	String b = new String ("hello");
//	
//	b=b.intern();
//	System.out.println(s==b);
	
	
	
	
	
	
	
//	String d = new String ("hello");
	//System.out.println(d==b);
	//System.out.println(s==s1);
	
	
	
	
	
	
	
	
	
	
//	
	
	//System.out.println(a);
	
//	String s ="hello";
//	String m = new String();//oops
	
		//System.out.println(arr);

//literal// no new keyword
	
	String s ="hello";// pool
	String s1 ="hello";//pool
	
	
	
// new keyword
	
	String s2 = new String ("hello"); // pool nd heap mein bhi s2 refer only to heap object

	s2 = s2.intern();
	
	char [] a = {'h','e','l','l','o','i'};
	
	String s3 = new String(a);  // heap;
	
	s3 =s3.intern();// poool 
	
	System.out.println(s3==s2);
	String j = "helloi";
	System.out.println(j==s3);
	
}}
