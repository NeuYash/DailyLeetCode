package com.leetcode.April;


//Problem Link: https://leetcode.com/problems/reverse-linked-list/description/
	//O(n) O(1)
public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode prev=null;
        ListNode cur=head;
        ListNode temp=head.next;

        while(temp!=null){
            cur.next=prev;
            prev=cur;
            cur=temp;
            temp=temp.next;
        }
        cur.next=prev;
        return cur;
    }
}
