Problem Link: https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/

Time Complexity: O(n)
Space Complexity: O(1)

class Solution {
    public int longestSubarray(int[] nums) {
        int prevCount = 0,newCount = 0,max = 0;
        boolean zeros = false;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                max = Math.max(newCount,max);
                newCount = prevCount;
                prevCount = 0;
                zeros = true;
            }
            else {
                prevCount++;
                newCount++;
            }
        }
        if(!zeros){
            return nums.length-1;
        }
        max = Math.max(newCount,max);
        return max;
    }
}