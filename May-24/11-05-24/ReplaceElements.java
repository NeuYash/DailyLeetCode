package com.leetcode.May;
//Problem Link: https://leetcode.com/problems/replace-elements-in-an-array/
//O(2n) O(1)
public class ReplaceElements {
	class Solution {
	    public int[] arrayChange(int[] nums, int[][] operations) {
	        // Map<Integer, Integer> numMap = new HashMap<>();
	        // for(int i=0;i<nums.length;i++){
	        //     numMap.put(nums[i], i);
	        // }

	        // for(int[] opr: operations){
	        //     nums[numMap.get(opr[0])]=opr[1];
	        //     numMap.put(opr[1], numMap.get(opr[0]));
	        // }

	        // return nums;

	        int[] numMap = new int[1000001];

	        for (int i = 0; i < nums.length; i++) {
	            numMap[nums[i]] = i; //store index at Value positions in array
	        }

	        for (int i = 0; i < operations.length; i++) {
	            nums[numMap[operations[i][0]]] = operations[i][1]; // replace nums[index] by newValue
	            numMap[operations[i][1]] = numMap[operations[i][0]]; //save index at value newValue
	        }

	        return nums;
	    }
	}
