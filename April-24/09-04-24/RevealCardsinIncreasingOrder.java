package com.leetcode.April;
//Problem Link: https://leetcode.com/problems/reveal-cards-in-increasing-order/description
//O(nlogn) O(n)
public class RevealCardsinIncreasingOrder {
	class Solution {
	    public int[] deckRevealedIncreasing(int[] deck) {
	        int[] res=new int[deck.length];
	        Arrays.sort(deck);
	        Queue<Integer> q=new LinkedList<>();
	        for(int i=0;i<deck.length;i++)
	            q.add(i);
	        
	        for(int card: deck){
	            int idx=q.remove();
	            res[idx]=card;
	            if(!q.isEmpty())
	                q.add(q.remove());
	        }
	        return res;
	    }
	}
}
