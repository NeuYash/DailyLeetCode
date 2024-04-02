package com.leetcode.April;

//Problem Link: https://leetcode.com/problems/intersection-of-two-linked-lists/description/
// O(m+n) O(1) 
public class IntersectionOfTwoLinkedList {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int lA = 0, lB = 0;
		ListNode cur = headA;
		while (cur != null) {
			lA++;
			cur = cur.next;
		}
		cur = headB;
		while (cur != null) {
			lB++;
			cur = cur.next;
		}
		while (lA > lB) {
			headA = headA.next;
			lA--;
		}
		while (lB > lA) {
			headB = headB.next;
			lB--;
		}

		while (headA != headB) {
			headA = headA.next;
			headB = headB.next;
		}
		return headA;
	}
}
