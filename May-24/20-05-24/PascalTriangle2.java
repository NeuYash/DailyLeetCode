

O(n^2) O(n)
public class PascalTriangle2 {
	class Solution {
	    public List<Integer> getRow(int n) {
	        List<List<Integer>> res = new ArrayList<>();
	        res.add(Arrays.asList(1));
	        res.add(Arrays.asList(1,1));
	        for(int i=2;i<=n;i++){
	            List<Integer> li = new ArrayList<>();
	            li.add(1);
	            for(int j=1;j<i;j++){
	                li.add(res.get(i-1).get(j)+res.get(i-1).get(j-1));
	            }
	            li.add(1);
	            res.add(li);
	        }
	        return res.get(n);
	    }
	}
}
