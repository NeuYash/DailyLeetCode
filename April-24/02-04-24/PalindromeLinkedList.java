package com.leetcode.April;

//Problem Link: https://leetcode.com/problems/palindrome-linked-list/
//O(n) O(1)
public class PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null)
			return true;
		ListNode slow = head, fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		fast = slow.next;
		slow.next = null;
		ListNode prev = null;
		while (fast != null) {
			ListNode cur = fast.next;
			fast.next = prev;
			prev = fast;
			fast = cur;
		}
		fast = prev;
		slow = head;
		while (fast != null && slow != null) {
			if (fast.val != slow.val)
				return false;
			fast = fast.next;
			slow = slow.next;
		}
		return true;

	}
}
