package com.leetcode.April;

import java.util.Arrays;

//Problem Link: https://leetcode.com/problems/unique-binary-search-trees/
//O(2n) O(n)
public class UniqueBinarySearchTree {
	class Solution {
	    public int numTrees(int n) {
	        int[] arr=new int[n+1];
	        Arrays.fill(arr,1);
	        for(int i=2;i<n+1;i++){
	            int total=0;
	            for(int j=1;j<i+1;j++){
	                int leftsubTreeNodes=j-1;
	                int rightsubTreeNode=i-j;
	                total+=arr[leftsubTreeNodes]*arr[rightsubTreeNode];
	            }
	            arr[i]=total;
	        }
	        return arr[n];
	    }
	}
}
