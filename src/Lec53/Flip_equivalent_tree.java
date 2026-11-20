package Lec53;

import Lec52.issymmetric.TreeNode;

public class Flip_equivalent_tree {

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
 
 
 public boolean isflipquivalent(TreeNode root1, TreeNode root2 ) {
	 if(root1==null&&root2==null) {
		 return true;
	 }
	 
	 if(root1==null||root2==null) {
		 return false;
	 }
	 
	 if(root1.val!=root2.val) {
		 return false;
	 }

	boolean issysmmetric = isflipquivalent(root1.left, root2.right) && isflipquivalent(root1.right, root2.left);
	 
boolean isame =isflipquivalent(root1.left, root2.left) && isflipquivalent(root1.right, root2.right);
	 

return issysmmetric||isame;
 }

}
