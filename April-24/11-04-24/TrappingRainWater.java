package com.leetcode.April;
//Problem Link: https://leetcode.com/problems/trapping-rain-water
//O(2n) O(1)
public class TrappingRainWater {
	class Solution {
	    //O(2n) O(1)
	    public int trap(int[] height) {
	        if(height==null || height.length==0) return 0;
	        int n=height.length;
	        // int max=0, maxIdx=-1;
	        // for(int i=0;i<n;i++){
	        //     if(height[i]>max){
	        //         max=height[i];
	        //         maxIdx=i;
	        //     }
	        // }
	        // int res=0;
	        // int left=0, leftwheight=0, right=n-1, rightWall=0;

	        // while(left<maxIdx){
	        //     if(leftwheight>height[left]){
	        //         res += leftwheight-height[left];
	        //     }else{
	        //         leftwheight=height[left];
	        //     }
	        //     left++;
	        // }

	        // while(right>maxIdx){
	        //     if(rightWall>height[right]){
	        //         res += rightWall-height[right];
	        //     }else{
	        //         rightWall=height[right];
	        //     }
	        //     right--;
	        // }

	        // return res;


	        //one pass solution O(n) O(1)
	        int res=0;
	        int left=0, leftwall=0, right=n-1, rightwall=0;

	        while(left<=right){
	            if(leftwall<=rightwall){
	                //if left wall is greater, process rightside
	                if(leftwall>height[left]){
	                    res += leftwall-height[left];
	                }else{
	                    leftwall=height[left];
	                }
	                left++;
	            }else{
	                if(rightwall>height[right]){
	                    res += rightwall-height[right];
	                }else{
	                    rightwall=height[right];
	                }
	                right--;
	            }
	        }
	        return res;

	    }
	}
}
