package com.leetcode.May;
//Problem Link: https://leetcode.com/problems/beautiful-array/
//O(2n) O(n)
public class BeautifulArray {
	class Solution {
	    public int[] beautifulArray(int n) {
	        if(n==1)
	            return new int[]{1};
	        
	        List<Integer> li = new ArrayList<>();
	        li.add(1);

	        while(li.size()<n){
	            List<Integer> temp = new ArrayList<>();
	            for(int val: li){
	                if(val*2-1 <=n)
	                    temp.add(val*2-1);
	            }
	            for(int val: li){
	                if(val*2<=n)
	                    temp.add(val*2);
	            }
	            
	            li = temp;
	        }
	        
	        int[] res= new int[n];
	        for(int i=0;i<n;i++){
	            res[i] = li.get(i);
	        }
	        return res;
	    }
	}
}
