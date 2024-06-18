package com.leetcode;

//O(n) O(n)
public class NArrayTreeTraversal {
	/*
	 * // Definition for a Node. class Node { public int val; public List<Node>
	 * children;
	 * 
	 * public Node() {}
	 * 
	 * public Node(int _val) { val = _val; }
	 * 
	 * public Node(int _val, List<Node> _children) { val = _val; children =
	 * _children; } };
	 */

	class Solution {
		public List<List<Integer>> levelOrder(Node root) {
			List<List<Integer>> res = new ArrayList<>();
			if (root == null)
				return res;

			Queue<Node> que = new LinkedList<>();
			que.add(root);
			while (!que.isEmpty()) {
				int size = que.size();
				List<Integer> li = new ArrayList<>();
				while (size-- > 0) {
					Node cur = que.poll();
					li.add(cur.val);
					for (Node child : cur.children) {
						if (child != null)
							que.add(child);
					}
				}
				res.add(li);
			}
			return res;
		}
	}
}
