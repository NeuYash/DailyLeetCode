package com.leetcode.May;
//Problem Link: https://leetcode.com/problems/container-with-most-water/
//O(n) O(1)
public class ContainerWithMostWater {
	class Solution {
	    public int maxArea(int[] height) {
	        //bruteForce
	        int maxA = 0;
	        // for(int i=0;i<height.length-1;i++){
	        //     for(int j=i+1;j<height.length;j++){
	        //         maxA = Math.max(maxA, Math.min(height[i], height[j])*(j-i));
	        //     }
	        // }
	        // return maxA;

	        int low = 0, high = height.length-1; 
	        while(low<high){
	            // int curArea = high -low;
	            // if(height[low]<height[high]){
	            //     curArea *=height[low];
	            //     int lowht = height[low];
	            // }else{
	            //     curArea *=height[high];
	            //     int highht = height[high];
	            // }
	            // maxA = Math.max(maxA, curArea);

	            int heightVar = Math.min(height[low],height[high]);
	            maxA = Math.max(maxA, heightVar*(high-low));
	            
	            while(low<high && height[low]<= heightVar)
	                low++;

	            while(low<high && height[high]<= heightVar)
	                high--;
	        }
	        return maxA;
	    }
	}
}
