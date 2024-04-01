Problem Link: https://leetcode.com/problems/count-subarrays-with-fixed-bounds/description/

Time Complexity: O(n)
Space Complexity: O(1)

class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans=0;
        int badi=-1, mini=-1, maxi=-1, n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<minK || nums[i]>maxK) //number that breaks subarrays
                badi=i;
            if(nums[i]==minK) //matches minK
                mini=i;
            if(nums[i]==maxK) //mathces maxK
                maxi=i;
            ans+=Math.max(0, Math.min(mini, maxi)-badi); //take minimum of both -badi
            //ans will choose 0 when mini and maxi are both left of badi
            //for other positive integers between range, we will be calculating ans at every iteration of INRANGE integers.
        }
        return ans;
    }
}
