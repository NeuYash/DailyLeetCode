package com.leetcode.May;
//Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
O(n) O(1)
public class RemoveDuplicatesLinkedList {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */
	class Solution {
	    public ListNode deleteDuplicates(ListNode head) {
	        if(head == null)
	            return head;
	        
	        ListNode dummy = new ListNode(-101);
	        dummy.next=head;
	        ListNode one = head, zero = dummy;
	        while(one!=null){
	            if(zero.val == one.val){
	                while(one!=null && zero.val == one.val){
	                    one=one.next;
	                }
	                zero.next = one;
	            }else{
	                zero=one;
	                one=one.next;
	            }
	        }
	        return head;
	    }
	}
}
