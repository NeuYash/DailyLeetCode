//O(nums.length) O(nums.length)
Problem Link: https://leetcode.com/problems/sum-of-all-subset-xor-totals/
public class SumOfSubsetsXORTotals {
	class Solution {
	    public int subsetXORSum(int[] nums) {
	        return xorSubsets(0, nums, 0);
	    }
	    public int xorSubsets(int index, int[] nums, int val){
	        if(index == nums.length) return val;
	        int include = xorSubsets(index+1,nums,val^nums[index]);
	        int exclude = xorSubsets(index+1,nums,val);
	        return include+exclude;
	    }
	}
}
