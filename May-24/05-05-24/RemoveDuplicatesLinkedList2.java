package com.leetcode.May;
//Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
O(n) O(1)
public class RemoveDuplicatesLinkedList2 {
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
	        ListNode dummy = new ListNode(-1);
	        dummy.next = head;
	        ListNode prev = dummy;
	        ListNode cur = head;

	        while(cur!=null && cur.next!=null){
	            if(cur.val == cur.next.val){
	                while(cur.next!=null && cur.val == cur.next.val)
	                    cur=cur.next;
	                prev.next = cur.next;
	            }else
	                prev = prev.next;
	            cur=cur.next;
	        }
	        return dummy.next;
	    }
	}
}
