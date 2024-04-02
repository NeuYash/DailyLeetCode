package com.leetcode.April;

//Problem Link:https://leetcode.com/problems/reorder-list/description/
//O(n) O(1)
public class ReorderList {
	public void reorderList(ListNode head) {
		ListNode slow = head, fast = head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		ListNode prev = null;
		fast = slow.next;
		slow.next = null;
		// reverse half of linkedlist
		while (fast != null) {
			ListNode cur = fast.next;
			fast.next = prev;
			prev = fast;
			fast = cur;
		}

		// reorder now
		slow = head;
		fast = prev;
		while (fast != null) {
			ListNode temp = slow.next;
			slow.next = fast;
			fast = fast.next;
			slow.next.next = temp;
			slow = temp;
		}
	}
}
