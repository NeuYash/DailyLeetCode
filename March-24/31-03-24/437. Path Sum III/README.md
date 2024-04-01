Problem Link: https://leetcode.com/problems/path-sum-iii/description/

Time Complexity: O(n)
Space Complexity: O(n)

class Solution {
    Map<Long, Integer> subArrSumMap;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)
            return 0;
        this.subArrSumMap=new HashMap<>();
        subArrSumMap.put(0l,1);
        return helper(root, 0, targetSum);
    }
    public int helper(TreeNode root, long curSum, int target){
        if(root==null)
            return 0;
        curSum+=root.val;
        int ans=subArrSumMap.getOrDefault(curSum-target, 0);

        subArrSumMap.put(curSum, subArrSumMap.getOrDefault(curSum, 0)+1);
        if(root.left!=null)
            ans+=helper(root.left, curSum, target);
        if(root.right!=null)
            ans+=helper(root.right, curSum, target);
        subArrSumMap.put(curSum, subArrSumMap.get(curSum)-1);
        return ans;
    }
}
