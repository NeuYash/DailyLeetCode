Problem Link: https://leetcode.com/problems/search-a-2d-matrix-ii/description/

Time Complexity: O(m+n)
Space Complexity: O(1)

class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int m=mat.length, n=mat[0].length;
        int row=0, col=n-1;

        while(row<m && col>=0){
            if(mat[row][col]==target)
                return true;
            if(target<mat[row][col]){
                col--;
            }else
                row++;
        }
        return false;
    }
}