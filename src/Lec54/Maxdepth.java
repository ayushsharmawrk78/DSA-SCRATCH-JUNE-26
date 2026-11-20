package Lec54;

import Lec53.Flip_equivalent_tree.TreeNode;

public class Maxdepth {
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
	
	static int d = 0;
	
public int maxDepth(TreeNode root) {
        
	
	helper(root, 1);
	
	return d;
	
    }


public void helper (TreeNode root , int cd) {
	
	
	
	if(root==null) {
		return;
	}
	
	if(cd>d) {
		d = cd;
	}
	
	helper( root.left, cd+1);
	helper( root.right, cd+1);
}

}
