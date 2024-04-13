package com.leetcode.April;
//Problem Link: https://leetcode.com/problems/maximal-square/
//O(m*n) O(n)
public class MaximalSquare {
	class Solution {
	    public int maximalSquare(char[][] mat) {
	        int m=mat.length;
	        int n=mat[0].length;
	        int max=0;
	        int[] dp=new int[n+1];
	        for(int i=1;i<=m;i++){
	            int diagUp=0;
	            for(int j=1;j<=n;j++){
	                int temp=dp[j];
	                if(mat[i-1][j-1]=='1'){
	                    dp[j]=1+Math.min(dp[j], Math.min(dp[j-1], diagUp));
	                    max=Math.max(max, dp[j]);
	                }else
	                    dp[j]=0;
	                diagUp=temp;
	            }
	        }
	        return max*max;
	        // for(int i=0;i<m;i++)
	        //     for(int j=0;j<n;j++){
	        //         if(mat[i][j]=='1'){
	        //             //find sq that we can form;
	        //             int len=1;
	        //             boolean flag=true;
	        //             while(flag && i+len<m && j+len<n){
	        //                 //everything in this square has to be one.
	        //                 for(int k=i+len;k>=i;k--)
	        //                     if(mat[k][j+len]=='0'){
	        //                         flag=false;
	        //                         break;
	        //                     }
	        //                 for(int k=j+len;k>=j;k--)
	        //                     if(mat[i+len][k]=='0'){
	        //                         flag=false;
	        //                         break;
	        //                     }
	        //                 if(flag)
	        //                     len++;
	        //             }
	        //             max=Math.max(max, len);
	        //         }
	        //     }
	        // return max*max;
	    }
	}
}
