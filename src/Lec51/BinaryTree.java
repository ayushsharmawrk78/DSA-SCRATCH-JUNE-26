package Lec51;

import java.util.Scanner;

public class BinaryTree {
Scanner in = new Scanner(System.in);
	
	
	public   class Node  {
		
		int val;
		Node left;
		Node right;
	}
	
	private Node root;
	
	public BinaryTree () {
		this.root = CreateTree();
		
		
	}
	
	public Node CreateTree() {
		int item = in.nextInt();
		
		Node nn = new Node();
		
		nn.val=item;
		boolean hlc = in.nextBoolean();
		if(hlc==true) {
			nn.left= CreateTree();
		}
		boolean rlc = in.nextBoolean();
		if(rlc==true) {
			nn.right= CreateTree();
		}
		
		
		return nn;
	}
	
	
	public void display2() {
		Display(root);
	}
	public void Display(Node nn) {
		if(nn==null) {
			return ;
		}
		
		String s  ="";
		
		s= "<-----"+nn.val+"------->";
		if(nn.left!=null) {
			s=nn.left.val+s
;		}
		else {
			s= "."+s;
		}
		
		if(nn.right!=null) {
			s= s+nn.right.val;
		}
		else {
			s= s+".";
		}
		
		System.out.println(s);
		
		Display(nn.left)
		;
		
		Display(nn.right);
	}
}
