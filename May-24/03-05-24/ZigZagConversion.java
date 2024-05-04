package com.leetcode.May;
//Problem Link: https://leetcode.com/problems/zigzag-conversion/
O(n) O(n)
public class ZigZagConversion {
	class Solution {
	    public String convert(String s, int numRows) {
	        if(numRows == 1 || s.length()<numRows)
	            return s;
	        StringBuilder[] arr = new StringBuilder[numRows];
	        int row = 0, dir = 0;
	        for(int i=0;i<s.length();i++){
	            row += dir;
	            if(arr[row]==null)
	                arr[row]=new StringBuilder();
	            arr[row].append(s.charAt(i));

	            if(row == 0 || row == numRows-1){
	                dir = (dir==0) ? 1: -dir;
	            }
	        }
	        StringBuilder res = new StringBuilder();
	        for(StringBuilder sb: arr)
	            res.append(sb.toString());
	        return res.toString();
	    }
	}
}
