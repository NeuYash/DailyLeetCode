package com.leetcode.April;

import java.util.PriorityQueue;
//Problem Link: https://leetcode.com/problems/total-cost-to-hire-k-workers/
//O(nlogn) O(cand)
public class TotalCostToHire {
	class Solution {
	    public long totalCost(int[] costs, int k, int cand) {
	        int cnt = 0, i=0, j=costs.length-1;
	        long ans=0;
	        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
	        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

	        while(cnt<k){
	            while(pq1.size()<cand && i<=j)
	                pq1.add(costs[i++]);
	            while(pq2.size()<cand && j>=i)
	                pq2.add(costs[j--]);
	            
	            int a = pq1.size()>0 ? pq1.peek() : Integer.MAX_VALUE;
	            int b = pq2.size()>0 ? pq2.peek() : Integer.MAX_VALUE;

	            if(a<=b){
	                ans+=a;
	                pq1.poll();
	            }else{
	                ans+=b;
	                pq2.poll();
	            }
	            cnt++;
	        }
	        return ans;
	    }
	}
}
