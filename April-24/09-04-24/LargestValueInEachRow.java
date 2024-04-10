package com.leetcode.April;
//Problem Link:https://leetcode.com/problems/find-largest-value-in-each-tree-row/
//O(n) O(n)
public class LargestValueInEachRow {
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode() {}
	 *     TreeNode(int val) { this.val = val; }
	 *     TreeNode(int val, TreeNode left, TreeNode right) {
	 *         this.val = val;
	 *         this.left = left;
	 *         this.right = right;
	 *     }
	 * }
	 */
	class Solution {
	    List<Integer> res;
	    HashMap<Integer, Integer> map;
	    public List<Integer> largestValues(TreeNode root) {
	        this.res=new ArrayList<>();
	        this.map=new HashMap<>();
	        if(root==null)
	            return res;

	        // Queue<TreeNode> q=new LinkedList<>();
	        // q.add(root);
	        // while(!q.isEmpty()){
	        //     int size=q.size();
	        //     int max=Integer.MIN_VALUE;
	        //     while(size-- > 0){
	        //         TreeNode cur=q.poll();
	        //         max=Math.max(max, cur.val);
	        //         if(cur.left!=null)
	        //             q.add(cur.left);
	        //         if(cur.right!=null)
	        //             q.add(cur.right);
	        //     }
	        //     res.add(max);
	        // }
	        // return res;

	        helper(root, 0);

	        return new ArrayList<>(map.values());
	    }
	    public void helper(TreeNode root, int level){
	        if(root==null)
	            return;
	        
	        if(map.containsKey(level)){
	            if(map.get(level)<root.val)
	                map.put(level,root.val);
	        }else{
	            map.put(level,root.val);
	        }

	        helper(root.left, level+1);
	        helper(root.right, level+1);
	    }
	}
}
