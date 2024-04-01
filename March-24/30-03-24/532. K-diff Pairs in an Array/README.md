Problem Link: https://leetcode.com/problems/k-diff-pairs-in-an-array/description/

Time Complexity: O(2n)
Space Complexity: O(n)

class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map=new HashMap<>();
        int res=0;
        for(int n:nums)
            map.put(n , map.getOrDefault(n, 0)+1);
        
        for(int x: map.keySet()){
            if(k>0 && map.containsKey(x+k))
                res++;
            else if(k==0 && map.get(x)>1)
                res++;
        }
        return res;
    }
}