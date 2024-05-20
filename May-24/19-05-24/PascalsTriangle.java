Problem Link: https://leetcode.com/problems/pascals-triangle/
//O(n*n) O(n)
public class PascalsTriangle {
	class Solution {
	    public List<List<Integer>> generate(int n) {
	        List<List<Integer>> res = new ArrayList<>();
	        res.add(Arrays.asList(1));

	        for(int i=1 ; i<n ; i++){
	            List<Integer> li = new ArrayList<>();
	            li.add(1);
	            for(int j = 1; j<i ; j++){
	                li.add(res.get(i-1).get(j)+res.get(i-1).get(j-1));
	            }
	            li.add(1);
	            res.add(li);
	        }
	        return res;
	    }
	}
}
