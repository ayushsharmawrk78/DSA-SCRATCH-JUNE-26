package Lec52;

public class issymmetric {
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
	
	 
	 
	 public boolean istrue(TreeNode root ) {
		 return issymmetric(root, root);
		 
		 
		 
	 }
	 public boolean issymmetric(TreeNode root1, TreeNode root2 ) {
		 if(root1==null&&root2==null) {
			 return true;
		 }
		 
		 if(root1==null||root2==null) {
			 return false;
		 }
		 
		 if(root1.val!=root2.val) {
			 return false;
		 }

		 boolean fs = issymmetric(root1.left, root2.right);
		 boolean ss =issymmetric(root1.right, root2.left);
		 
		 return fs&&ss;
		 
	 }

}
