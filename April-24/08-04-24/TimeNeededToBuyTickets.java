package com.leetcode.April;
//Problem Link: https://leetcode.com/problems/time-needed-to-buy-tickets
//O(n) O(n)
public class TimeNeededToBuyTickets {
	class Solution {
	    public int timeRequiredToBuy(int[] tickets, int k) {
	        Queue<Integer> q=new LinkedList<>();
	        for(int i=0;i<tickets.length;i++)
	            q.add(i);
	        int seconds=0;
	        while(!q.isEmpty()){
	            int idx=q.remove();
	            if(idx==k && tickets[idx]==1)
	                return seconds+1;
	            if(tickets[idx]==1){
	                tickets[idx]--;
	            }
	            else{
	                tickets[idx]--;
	                q.add(idx);
	            }
	            seconds++;
	        }
	        return 0;
	    }
	}
}
