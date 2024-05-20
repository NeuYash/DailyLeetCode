//Problem Link: https://leetcode.com/problems/prison-cells-after-n-days/
//O(7n) O(8)
public class PrisonCellsAfterNDays {
	class Solution {
	    public int[] prisonAfterNDays(int[] cells, int n) {
	        //As the first and last bits remain the same (because only 1 neighbor cell)
	        if(n%14==0)
	            n=14;
	        else
	            n %=14;
	        
	        for(int i=0;i<n;i++){
	            int[] next = new int[cells.length];
	            for(int j = 1; j<cells.length-1; j++){
	                if(cells[j-1]==cells[j+1])
	                    next[j]=1;
	                else
	                    next[j]=0;
	            }
	            cells = next;
	        }
	        return cells;
	    }
	}
}
