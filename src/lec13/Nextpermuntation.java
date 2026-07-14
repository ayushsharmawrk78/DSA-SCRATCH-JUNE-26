package lec13;

public class Nextpermuntation {

	public static void main(String[] args) {
		// TODO Autarro-generated method stub
int []arr = {3,2,1};


nextpermuntation(arr);
for (int i = 0; i < arr.length; i++) {
	System.out.print(arr[i]+" ");
}
	}
	
	public static void nextpermuntation(int []arr) {
		int p=0;
		
		
for (int i = arr.length-2; i >=0; i--) {
	if(arr[i]<arr[i+1]) {
		p=i
;
		
	break;}
	
	
	




	
}

int q=0;;
for (int j = arr.length-1; j >=0; j--) {
	
	if(arr[j]>arr[p]) {
	q=j;
	break;
	}
}

if(p==0&&q==0) {
	reverse(arr, 0, arr.length-1);
	return;
}



// swapping

int temp =arr[p];
arr[p]=arr[q];
arr[q]=temp;


reverse(arr, p+1, arr.length-1);
	}
	
	
	public static void reverse(int []arr , int i , int j) {
		
		
		
		while(i<=j) {
			int temp =arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
		
		
	}

}
