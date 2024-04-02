package com.leetcode.April;


//Problem Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
	//O(n) O(1)
public class RemoveNthNodeFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode slow=dummy, fast=head;
        while(n-->0){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}
