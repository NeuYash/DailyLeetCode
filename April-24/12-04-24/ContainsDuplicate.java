package com.leetcode.April;
//O(n) O(n)
//Problem: https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {
	class Solution {
	    public boolean containsDuplicate(int[] nums) {
	        Set<Integer> freqSet=new HashSet<>();
	        for(int i: nums){
	            if(freqSet.contains(i)){
	                return true;
	            }
	            freqSet.add(i);
	        }
	        return false;
	    }
	}
}
