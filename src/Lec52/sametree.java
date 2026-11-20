package Lec52;

import Lec52.issymmetric.TreeNode;

public class sametree {
	
	
	 public boolean issame(TreeNode root1, TreeNode root2 ) {
		 if(root1==null&&root2==null) {
			 return true;
		 }
		 
		 if(root1==null||root2==null) {
			 return false;
		 }
		 
		 if(root1.val!=root2.val) {
			 return false;
		 }

		 boolean fs = issame(root1.left, root2.left);
		 boolean ss =issame(root1.right, root2.right);
		 
		 return fs&&ss;
		 
	 }
}
