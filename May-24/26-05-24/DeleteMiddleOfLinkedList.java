package com.leetcode;

//O(n) O(1)
public class DeleteMiddleOfLinkedList {
	/**
	 * Definition for singly-linked list. public class ListNode { int val; ListNode
	 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
	 * ListNode next) { this.val = val; this.next = next; } }
	 */
	class Solution {
		public ListNode deleteMiddle(ListNode head) {
			if (head == null || head.next == null)
				return null;
			ListNode slow = new ListNode(-1);
			slow.next = head;
			ListNode fast = head;
			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			slow.next = slow.next.next;
			// slow.next.next = null;
			return head;
		}
	}
}
