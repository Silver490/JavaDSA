package Lec46;

import Lec46.Insert_into_BST.TreeNode;

public class Validate_BST {
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

	class bstPair {
		long max = Long.MIN_VALUE;
		long min = Long.MAX_VALUE;
		boolean isbst = true;

	}

	class Solution {
		public boolean isValidBST(TreeNode root) {
			return valid(root).isbst;
		}

		public bstPair valid(TreeNode root) {
			if (root == null) {
				return new bstPair();
			}

			bstPair lbstp = valid(root.left);
			bstPair rbstp = valid(root.right);
			
			bstPair sbstp = new bstPair();
			sbstp.min = Math.min(root.val, Math.min(lbstp.min, rbstp.min));
			sbstp.max = Math.max(root.val, Math.max(lbstp.max, rbstp.max));

			if (lbstp.isbst && rbstp.isbst && lbstp.max < root.val && rbstp.min > root.val) {
				sbstp.isbst=true;
			} else {
				sbstp.isbst=false;
			}
			return sbstp;
		}
	}
}