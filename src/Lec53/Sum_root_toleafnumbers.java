package Lec53;

import Lec53.Flip_equivalent_tree.TreeNode;

public class Sum_root_toleafnumbers {

	 public int sumNumbers(TreeNode root) {
	        
		 
		return helper(root, 0);
	    }
	 
	 public int helper (TreeNode root , int sum) {
		 
		 
		 if(root==null) {
			 return 0;
		 }
		 if(root.left==null&&root.right==null) {
			 
			 return sum*10+root.val;
		 }
		 
		 
		 int l = helper(root.left, sum*10+root.val);
		 int r = helper(root.right, sum*10+root.val);
		 
		 return l+r;
	 }
	 
	 
	
}
