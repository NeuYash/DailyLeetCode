package com.leetcode.April;
//O(m*(m+n)) O(n)
//Problem Link: https://leetcode.com/problems/maximal-rectangle/description
public class MaximalRectangle {
	class Solution {
	    //O(m*(m+n)) O(n)
	    public int maximalRectangle(char[][] mat) {
	        int m=mat.length;
	        int n=mat[0].length;
	        int area=0;
	        int[] height=new int[n];
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                if(mat[i][j]=='1')
	                    height[j]++;
	                else
	                    height[j]=0;
	            }
	            int curArea=calcArea(height);
	            area=Math.max(area, curArea);
	        }
	        return area;
	    }

	    private int calcArea(int[] height){
	        Stack<Integer> st=new Stack<>();
	        int n=height.length;
	        int maxArea=0;
	        for(int i=0;i<=n;i++){
	            while(!st.isEmpty() && (i==n || height[st.peek()]>=height[i])){
	                int ht=height[st.peek()];
	                st.pop();
	                int width=0;
	                if(st.isEmpty())
	                    width=i;
	                else
	                    width=i-st.peek()-1;
	                maxArea=Math.max(maxArea, ht*width);
	            }
	            st.push(i);
	        }
	        return maxArea;
	    }
	}
}
