package com.leetcode.April;

//Problem Link: https://leetcode.com/problems/linked-list-cycle/
	//O(n) O(1)
public class LinkedListCycle {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public boolean hasCycle(ListNode head) {
		if (head == null)
			return false;
		ListNode fast = head, slow = head;

		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow)
				return true;
		}
		return false;
	}
}
