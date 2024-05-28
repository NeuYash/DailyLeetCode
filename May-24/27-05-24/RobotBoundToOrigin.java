package com.leetcode;
//O(n) O(1)
public class RobotBoundToOrigin {
	class Solution {
	    int[][] dirs;

	    public boolean judgeCircle(String moves) {
	        int[] count = new int[26];
	        for(char ch:moves.toCharArray()){
	            count[ch-'A']++;
	        }
	        return count['U'-'A'] == count['D'-'A'] && count['L'-'A']==count['R'-'A'];
	        // this.dirs = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
	        // int idx = 0;
	        // int x = 0, y = 0;
	        // for (int i = 0; i < moves.length(); i++) {
	        //     char ch = moves.charAt(i);
	        //     if(ch=='U'){
	        //         x+=dirs[0][0];
	        //         y+=dirs[0][1];
	        //     }else if(ch=='L'){
	        //         x+=dirs[3][0];
	        //         y+=dirs[3][1];
	        //     }else if(ch=='R'){
	        //         x+=dirs[1][0];
	        //         y+=dirs[1][1];
	        //     }else{
	        //         x+=dirs[2][0];
	        //         y+=dirs[2][1];
	        //     }
	        // }
	        // return x==0&&y==0;
	    }
	}
}
