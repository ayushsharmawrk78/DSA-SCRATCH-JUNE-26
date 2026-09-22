package lec37;

public class StackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
MyStack st = new MyStack(6);
//System.out.println(st);
//
//int m= st.arr[2];

st.push(1);
st.push(10);
st.push(121);
st.push(190);
System.out.println(st);


System.out.println(st.peek());



System.out.println(st.pop());
System.out.println(st);
//st.push(190);
//st.push(190);
//st.push(190);
//st.push(190);


System.out.println(st.pop());
System.out.println(st.pop());
System.out.println(st.pop());
System.out.println(st.pop());
System.out.println(st.pop());
System.out.println(st.pop());


	}

}
