package com.leetcode;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

//O(1->Amortized) O(1)
public class FlattenNestedListIterator {
	public class NestedIterator implements Iterator<Integer> {
	    NestedInteger nextEl;
	    Stack<Iterator<NestedInteger>> st;
	    public NestedIterator(List<NestedInteger> nestedList) {
	        this.st = new Stack<>();
	        st.push(nestedList.iterator());
	    }

	    @Override
	    public Integer next() {
	        return nextEl.getInteger();
	    }

	    @Override
	    public boolean hasNext() {
	        while(!st.isEmpty()){
	            if(!st.peek().hasNext()){
	                st.pop();
	            } else if((nextEl = st.peek().next()).isInteger())
	                return true;
	            else{
	                st.push(nextEl.getList().iterator());
	            }
	        }
	        return false;
	    }
	}
}
