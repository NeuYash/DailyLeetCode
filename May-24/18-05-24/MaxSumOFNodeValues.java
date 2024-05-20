//O(n) O(1)
//Problem Link: https://leetcode.com/problems/find-the-maximum-sum-of-node-values/description/
public class MaxSumOFNodeValues {
	class Solution {
	    public long maximumValueSum(int[] nums, int k, int[][] edges) {
	        long res = 0;
	        int d = 1 << 30, c = 0;
	        for (int a : nums) {
	            int b = a ^ k;
	            res += Math.max(a, b);
	            c ^= a < b ? 1 : 0;
	            d = Math.min(d, Math.abs(a - b));
	        }
	        return res - d * c;
	    }
	}
}
