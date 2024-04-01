Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/

Time Complexity: O(n)
Space Complexity: O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int k=2;
        int slow=1;
        int fast=1;
        int count=1;
        while(fast<nums.length){
            if(nums[fast]==nums[fast-1]) // if same element as before-> increse count
                count++;
            else // new element, turn count as 1
                count=1; 
            if(count<=k){
                nums[slow++]=nums[fast++]; // count is yet to match k so change nums[slow to fast]
            }
            else
                fast++; //count greater than k, dont change slow, just increment fast as wr are ignoring it.
        }
        return slow; //slow starts with 1, so return last element. -> slow
    }
}