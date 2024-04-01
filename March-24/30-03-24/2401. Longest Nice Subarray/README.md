Problem Link: https://leetcode.com/problems/longest-nice-subarray/description/

Time Complexity: O(n)
Space Complexity: O(1)

class Solution {
    public int longestNiceSubarray(int[] nums) {
        if(nums.length==1)
            return 1;
        int maxCnt=0, n=nums.length, bitwise=0;
        int left=0, union=0;
        for(int i=0;i<n;i++){
            int newEl=nums[i];
            while((union & newEl)!=0){
                int leftEl=nums[left];
                union ^=leftEl;
                left++;
            }
            union=union | newEl;
            maxCnt=Math.max(maxCnt, i-left+1);
        }
        return maxCnt;
    }
}