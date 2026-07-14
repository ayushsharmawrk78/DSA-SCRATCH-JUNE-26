package lec13;

public class Spiralprintclockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= {
				{10,20,30,40},
				{50,60,70,80},
				{90,100,110,120},
				
				{130,140,150,160}
				
		};
		spiralprint(arr);
	}
	public static void spiralprint(int [][]arr) {
		
		
		
		int minr = 0;
		int minc = 0;
		int maxr = arr.length-1;
		int maxc = arr[0].length-1;
		
		int num = arr.length*(arr[0].length);
		
		int c=0;
		while(c<num) {

			for (int i = minc; i <=maxc&&c<num; i++) {
				System.out.print(arr[minr][i]+" ");
				c++;
			}
			
			minr++;
		
			
			for (int i = minr; i <=maxr&&c<num; i++) {
				System.out.print(arr[i][maxc]+" ");
				c++;
			}
			maxc--;
			for (int i = maxc; i >=minc&&c<num; i--) {
				System.out.print(arr[maxr][i]+" ");
				c++;
			}
			maxr--;
			for (int i = maxr; i >=minr&&c<num; i--) {
				System.out.print(arr[i][minc]+" ");
				c++;
			}
			minc++;
			
		}
		}
		

}
