Problem Link: https://leetcode.com/problems/rotate-image/

Time Complexity: O(2n)
Space Complexity: O(1)

class Solution {
    public void rotate(int[][] mat) {
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int l=0, h=n-1;
            while(l<=h){
                int temp=mat[i][l];
                mat[i][l]=mat[i][h];
                mat[i][h]=temp;
                l++;
                h--;
            }
        }
    }
}