package Lec47;

public class LLclient {

	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub

		LinkedList ll = new LinkedList();
		ll.addfirst(1);
		ll.addfirst(2);
		
		ll.addlast(20);
ll.addlast(40);
System.out.println(ll.removefirst());
		System.out.println(ll);
		
		
		System.out.println(ll.removelast());
		System.out.println(ll);
		
		ll.addatindex(50,1);
		
		ll.addatindex(60,1);
		System.out.println(ll.removeatindex(1));
		System.out.println(ll);
	}

}
