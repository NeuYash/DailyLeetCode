Problem Link: https://leetcode.com/problems/sort-colors/description/

Time Complexity: O(n)
Space Complexity: O(1)

class Solution {
    public void sortColors(int[] nums) {
        // int red=0, white=0, blue=0;
        // int n=nums.length, idx=0;
        // for(int i: nums){
        // if(i==0)
        // red++;
        // else if(i==1)
        // white++;
        // else
        // blue++;
        // }
        // while(red>0){
        // nums[idx++]=0;
        // red--;
        // }
        // while(white>0){
        // nums[idx++]=1;
        // white--;
        // }
        // while(blue>0){
        // nums[idx++]=2;
        // blue--;
        // }
        int l = 0;
        int r = nums.length - 1;

        for (int i = 0; i <= r;)
            if (nums[i] == 0)
                swap(nums, i++, l++);
            else if (nums[i] == 1)
                ++i;
            else
                swap(nums, i, r--);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}