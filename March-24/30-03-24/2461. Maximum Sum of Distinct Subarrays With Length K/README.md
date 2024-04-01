Problem Link: https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/description/

Time Complexity: O(n)
Space Complexity: O(n)

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        int slow=0, fast=0, n=nums.length;
        long ans=0, sum=0;
        
        while(slow<n-k+1){
            if(fast-slow==k){
                ans=Math.max(ans, sum);
                sum-=nums[slow];
                set.remove(nums[slow]);
                slow++;
            }else if(!set.contains(nums[fast])){
                sum+=nums[fast];
                set.add(nums[fast]);
                fast++;
            }else{
                sum-=nums[slow];
                set.remove(nums[slow]);
                slow++;
            }
        }
        return ans;
    }
}