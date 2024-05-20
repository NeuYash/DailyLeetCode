
//Problem Link: https://leetcode.com/problems/distribute-coins-in-binary-tree/
//O(n) O(h)
public class DistributeCoins {
	class Solution {
	    int ans;
	    public int distributeCoins(TreeNode root) {
	        helper(root);
	        return ans;
	    }
	    public int helper(TreeNode root){
	        if(root == null)
	            return 0;
	        int extras = root.val-1 + helper(root.left) + helper(root.right);
	        ans+=Math.abs(extras);
	        return extras;
	    }
	}
}
