package com.leetcode;

//O(n) O(n)
public class LargestRectInHistogram {
	class Solution {
		public int largestRectangleArea(int[] heights) {
			int n = heights.length;
			int res = 0;
			// for(int i=0;i<n;i++){
			// int min = heights[i];
			// for(int j=i;j<n;j++){
			// min = Math.min(min, heights[j]);
			// res = Math.max(res, min*(j-i+1));
			// }
			// }
			Stack<Integer> st = new Stack<>();
			st.push(-1);
			for (int i = 0; i < n; i++) {
				while (st.peek() != -1 && heights[st.peek()] > heights[i]) {
					int popped = st.pop();
					res = Math.max(res, heights[popped] * (i - st.peek() - 1));
				}
				st.push(i);
			}
			while (st.peek() != -1) {
				int popped = st.pop();
				res = Math.max(res, heights[popped] * (n - st.peek() - 1));
			}
			return res;
		}
	}
}
