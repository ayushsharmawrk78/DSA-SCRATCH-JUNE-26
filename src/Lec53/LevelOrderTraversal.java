package Lec53;

import java.util.LinkedList;
import java.util.Queue;

import Lec53.Flip_equivalent_tree.TreeNode;

public class LevelOrderTraversal {

	
	
	
	public void  Level(TreeNode root) {
		
		
		Queue<TreeNode>q = new LinkedList<>();
		
		q.add(root);
		
		while(!q.isEmpty()) {
			TreeNode  nn = q.poll();
			
			System.out.println(nn.val);
			
			
			
			if(nn.left!=null) {
				q.add(nn.left);
			}
			
			if(nn.right!=null) {
				q.add(nn.right);
			}
		}
		
		
		
	}
}
