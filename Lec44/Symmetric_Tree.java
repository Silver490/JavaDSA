package Lec44;

public class Symmetric_Tree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public boolean isSymmetric(TreeNode root) {

			return isMirror(root, root);
		}
		private boolean isMirror(TreeNode root1, TreeNode root2) {
			// TODO Auto-generated method stub
			if (root1 == null && root2 == null) { //both are null
				return true;
			}
			if (root1 == null || root2 == null) { // koi ek null hai
				return false;
			}
			if (root1.val != root2.val) { // values mismatch ho jaaye ho
				return false;             // to check same structure remove this statement
			}
			boolean fs = isMirror(root1.left, root2.right);
			boolean ss = isMirror(root1.right, root2.left);
			return fs && ss;
		}
	}

}
