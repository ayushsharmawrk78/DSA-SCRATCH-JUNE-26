package Lec52;

import java.util.Scanner;

import Lec51.BinaryTree.Node;

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
	
public void Post(Node nn) {
		
		
		if(nn==null) {
			return;
		}
		
		Post(nn.left);
		Post(nn.right);
		System.out.println(nn.val);
	}
	public void In(Node nn) {
		
		
		if(nn==null) {
			return;
		}
		
		In(nn.left);
		In(nn.right);
		System.out.println(nn.val);
	}
public void Pre(Node nn) {
		
		
		if(nn==null) {
			return;
		}
		System.out.println(nn.val);
		Pre(nn.left);
		Pre(nn.right);
	
	}

public int max(Node root) {
	
	
	if(root==null) {
		return Integer.MIN_VALUE;
	}
	
	int l = max(root.left);
	int r = max (root.right);
	
	return Math.max(Math.max(l, r), root.val);
}
public int min(Node root) {
	
	
	if(root==null) {
		return Integer.MAX_VALUE;
	}
	
	int l = max(root.left);
	int r = max (root.right);
	
	return Math.min(Math.min(l, r), root.val);
}

public int height (Node root) {
	
	if(root ==null) {
		return -1;
	}
	
	int lh = height(root.left);
	int rh = height(root.right);
	
	return Math.max(lh, rh)+1;
}



}

