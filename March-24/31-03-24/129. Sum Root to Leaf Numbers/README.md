Problem Link: https://leetcode.com/problems/sum-root-to-leaf-numbers/

Time Complexity: O(n)
Space Complexity: O(n) (RecursiveStack Space)

class Solution {
    int total;
    public int sumNumbers(TreeNode root) {
        if(root==null)
            return total;
        
        dfs(root, 0, 0);
        return total;
    }

    public void dfs(TreeNode root, int sum, int lvl){
        if(root==null)
            return;
        
        sum=sum*10+root.val;
        if(root.left==null && root.right==null){
            total+=sum;
        }
        dfs(root.left, sum, lvl+1);
        dfs(root.right, sum, lvl+1);
    }
}
