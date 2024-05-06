package com.leetcode.May;
//Problem Link: https://leetcode.com/problems/remove-nodes-from-linked-lis
O(n) O(n)
public class RemoveNodesFromLinkedList {
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
	    public ListNode removeNodes(ListNode head) {
	        if(head.next==null)
	            return head;
	        head.next = removeNodes(head.next);
	        if(head.val<head.next.val)
	            return head.next;
	        else
	            return head;
	        // Stack<ListNode> st = new Stack<>();
	        // ListNode dummy = new ListNode(Integer.MAX_VALUE);
	        // st.push(dummy);

	        // while(head!=null){
	        //     while(st.peek().val < head.val)
	        //         st.pop();
	        //     st.peek().next = head;
	        //     st.push(head);
	        //     head = head.next;
	        // }

	        // return dummy.next;
	    }
	}
