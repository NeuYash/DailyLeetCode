
//O(2^n) O(n)
public class Subsets {
	class Solution {
	    List<List<Integer>> res;
	    public List<List<Integer>> subsets(int[] nums) {
	        this.res= new ArrayList<>();
	        dfs(nums, 0, new ArrayList<>());
	        return res;
	    }
	    private void dfs(int[] nums, int idx, List<Integer> path){
	        // if(idx==nums.length){
	        //     res.add(new ArrayList<>(path));
	        //     return;
	        // }
	        // dfs(nums, idx+1, path);
	            // path.add(nums[i]);
	            // dfs(nums, i+1, path);
	            // path.remove(path.size()-1);
	        
	        res.add(new ArrayList<>(path));
	        for(int i=idx;i<nums.length;i++){
	            path.add(nums[i]);
	            dfs(nums, i+1, path);
	            path.remove(path.size()-1);
	        }
	    }
	}
}
