//O(2n) O(1)
//Problem Link: https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
public class KthSmallestElementInSortedMatrix {
	class Solution {
	    public int kthSmallest(int[][] matrix, int k) {
	        int n = matrix.length;
	        int low = matrix[0][0];
	        int high = matrix[n-1][n-1];
	        while(low<=high){
	            int mid = high + (low - high)/2;
	            int cnt = calc(matrix, mid);
	            if(cnt<k)
	                low = mid+1;
	            else
	                high = mid-1;
	        }
	        return low;
	    }
	    private int calc(int[][] mat, int mid){
	        int row = 0, col = mat.length-1, ans=0;
	        while(row<mat.length && col>=0){
	            if(mat[row][col]<=mid){
	                ans+=col+1;
	                row++;
	            }else
	                col--;
	        }
	        return ans;
	    }
	}
}
