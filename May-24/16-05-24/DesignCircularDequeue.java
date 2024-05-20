package com.leetcode.May;
//Problem Link: https://leetcode.com/problems/design-circular-deque/
//O(1) O(1)
public class DesignCircularDequeue {
	class MyCircularDeque {

	    private class Node {
	        int value;
	        Node next, prev;
	        Node(int value) {
	            this.value = value;
	        }
	    }

	    int size =0, maxSize;
	    private Node head, tail;
	    public MyCircularDeque(int k) {
	        maxSize=k;
	        head=new Node(-1);
	        tail = new Node(-1);
	        head.next=tail;
	        tail.prev=head; 
	    }
	    
	    public boolean insertFront(int value) {
	        if(isFull())
	            return false;
	        Node newNode = new Node(value);
	        newNode.next = head.next;
	        head.next = newNode;
	        newNode.prev = head;
	        newNode.next.prev = newNode;
	        size++;
	        return true;
	    }
	    
	    public boolean insertLast(int value) {
	        if(isFull())
	            return false;
	        Node newNode = new Node(value);
	        tail.prev.next = newNode;
	        newNode.next = tail;
	        newNode.prev = tail.prev;
	        tail.prev = newNode;
	        size++;
	        return true;
	    }
	    
	    public boolean deleteFront() {
	        if(isEmpty())
	            return false;
	        Node temp = head.next;
	        head.next = temp.next;
	        temp.next.prev = temp.prev;
	        size--;
	        return true;
	    }
	    
	    public boolean deleteLast() {
	        if(isEmpty())
	            return false;
	        
	        Node temp = tail.prev;
	        tail.prev = temp.prev;
	        temp.prev.next = temp.next;
	        size--;
	        return true;
	    }
	    
	    public int getFront() {
	        return isEmpty() ? -1 : head.next.value;
	    }
	    
	    public int getRear() {
	        return isEmpty() ? -1 : tail.prev.value;
	    }
	    
	    public boolean isEmpty() {
	        return size == 0;
	    }
	    
	    public boolean isFull() {
	        return size == maxSize;
	    }
	}

	/**
	 * Your MyCircularDeque object will be instantiated and called as such:
	 * MyCircularDeque obj = new MyCircularDeque(k);
	 * boolean param_1 = obj.insertFront(value);
	 * boolean param_2 = obj.insertLast(value);
	 * boolean param_3 = obj.deleteFront();
	 * boolean param_4 = obj.deleteLast();
	 * int param_5 = obj.getFront();
	 * int param_6 = obj.getRear();
	 * boolean param_7 = obj.isEmpty();
	 * boolean param_8 = obj.isFull();
	 */
}
