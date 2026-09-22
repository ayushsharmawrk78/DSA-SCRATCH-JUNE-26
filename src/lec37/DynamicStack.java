package lec37;

public class DynamicStack extends MyStack {

	
	
	@Override
	public void push(int item) throws Exception {
		// TODO Auto-generated method stub
		if(isfull()==true) {
			int []arr2 = new int [arr.length*2];
			for (int i = 0; i < arr.length; i++) {
				arr2[i]=arr[i];
			}
		arr=arr2;
		}
		super.push(item);

	}
	
	
}
