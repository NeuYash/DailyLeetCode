package com.leetcode.April;

//Problem Link: https://leetcode.com/problems/linked-list-cycle-ii/
//O(N) O(1)
public class LinkedListCycle2 {
	public ListNode detectCycle(ListNode head) {
		ListNode fast = head, slow = head;
		boolean flag = false;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				flag = true;
				break;
			}
		}
		if (!flag)
			return null;
		slow = head;
		while (fast != slow) {
			fast = fast.next;
			slow = slow.next;
		}
		return fast;
	}
}
