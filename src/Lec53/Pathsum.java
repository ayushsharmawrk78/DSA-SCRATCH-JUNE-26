package Lec53;

import Lec53.Flip_equivalent_tree.TreeNode;

public class Pathsum {

	
	
public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root, targetSum, 0);
    }

public boolean helper(TreeNode root, int targetSum , int cs) {
	
	
	if(root==null) {
		return false;
	}
	if(root.left==null&&root.right==null) {
		cs = cs+root.val
;
		if(cs==targetSum) {
			return true;
		}
	}
	
	
boolean l = helper(root.left, targetSum, cs+root.val);


boolean r = helper(root.right, targetSum, cs+root.val);


return l||r;

}
}
