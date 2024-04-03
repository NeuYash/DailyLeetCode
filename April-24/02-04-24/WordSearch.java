package com.leetcode.April;

//Problem link: https://leetcode.com/problems/word-search
//(m*n*4^k) O(1)
public class WordSearch {
	int[][] dirs;
    int m, n;
    public boolean exist(char[][] board, String word) {
        this.dirs=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        m=board.length;
        n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(backtrack(board, word, i, j, 0))
                    return true;
            }
        }
        return false;
    }
    private boolean backtrack(char[][] board, String str, int i, int j, int idx){
        //base
        if(idx==str.length()){
            return true;
        }
        if(i<0 || j<0 || j==n || i==m || board[i][j]=='#')
            return false;

        //logic
        if(str.charAt(idx)==board[i][j]){
            board[i][j]='#';
            for(int[] dir: dirs){
                int nr=dir[0]+i;
                int nc=dir[1]+j;
                if(backtrack(board, str, nr, nc, idx+1))
                    return true;
            }
            board[i][j]=str.charAt(idx);
        }
        return false;
    }
}
