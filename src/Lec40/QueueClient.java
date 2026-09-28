package Lec40;

public class QueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Queue q = new Queue();

q.enqueue(10);
q.enqueue(20);
q.enqueue(30);
q.enqueue(40);
q.enqueue(50);
System.out.println(q);
//q.enqueue(60);


System.out.println(q.dequeue());
System.out.println(q.dequeue());
System.out.println(q);
q.enqueue(60);
System.out.println(q);
System.out.println(q.dequeue());

System.out.println(q);
	}

}
