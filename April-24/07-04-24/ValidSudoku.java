package com.leetcode.April;
//Problem Link:https://leetcode.com/problems/valid-sudoku/
//O(9*9) O(9*9)
public class ValidSudoku {
	class Solution {
	    public boolean isValidSudoku(char[][] board) {
	        Set<String> set=new HashSet<>();
	        for(int i=0;i<9;i++)
	            for(int j=0;j<9;j++){
	                if(board[i][j]!='.'){
	                    if(set.contains("row"+i+board[i][j]) || set.contains("col"+j+board[i][j]) || set.contains("grid"+i/3+j/3+board[i][j]))
	                        return false;
	                    set.add("row"+i+board[i][j]);
	                    set.add("col"+j+board[i][j]);
	                    set.add("grid"+i/3+j/3+board[i][j]);
	                }
	            }
	            return true;
	    }
	}
}
