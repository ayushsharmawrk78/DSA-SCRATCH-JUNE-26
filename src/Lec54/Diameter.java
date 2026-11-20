package Lec54;

import Lec52.BinaryTree.Node;
import Lec53.Flip_equivalent_tree.TreeNode;

public class Diameter {
	public class TreeNode {
	    int val;
	    TreeNode left;
	     TreeNode right;
	     TreeNode() {}
	     TreeNode(int val) { this.val = val; }
	     TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	         this.left = left;
	        this.right = right;
	     }
	 }
	
	
	
	
	
	public int height (TreeNode root) {
		
		if(root ==null) {
			return -1;
		}
		
		int lh = height(root.left);
		int rh = height(root.right);
		
		return Math.max(lh, rh)+1;
	}
	
	
	public int diameter (TreeNode root) {
		if(root==null) {
			return 0;
			
		}
		
	
		
		int ld = diameter(root.left);
		int rd = diameter( root.right);
		int sd = height(root.left)+height(root.right)+2;
		
		return Math.max(Math.max(ld, rd), sd);
		
		
		
		
		
	}
}
