package com.leetcode;

//O(n) O(n)
public class ConvertSortedArrayToBST {
	class Solution {
		public TreeNode sortedArrayToBST(int[] nums) {
			if (nums.length == 0)
				return null;
			return binarySearchHelper(nums, 0, nums.length - 1);
		}

		public TreeNode binarySearchHelper(int[] nums, int left, int right) {
			if (left > right)
				return null;
			int mid = left + (right - left) / 2;
			TreeNode node = new TreeNode(nums[mid]);
			node.left = binarySearchHelper(nums, left, mid - 1);
			node.right = binarySearchHelper(nums, mid + 1, right);
			return node;
		}
	}
	// class Solution {
//	     public TreeNode sortedArrayToBST(int[] nums) {
//	         return CreateBST(nums, 0, nums.length - 1);
//	     }

//	     private TreeNode CreateBST(int nums[], int l, int r) {
//	         if (l > r) { // Base Condition or Recursion Stoping Condition
//	             return null;
//	         }
//	         int mid = l + (r - l) / 2;
//	         TreeNode root = new TreeNode(nums[mid]);
//	         root.left = CreateBST(nums, l, mid - 1);
//	         root.right = CreateBST(nums, mid + 1, r); 
//	         return root;
//	     }
	// }
}
