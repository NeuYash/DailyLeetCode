//Problem Link : https://leetcode.com/problems/4sum/
//O(n^2LogN) O(1)
public class The4Sum {
	class Solution {
	    public List<List<Integer>> fourSum(int[] nums, int target) {
	        int n=nums.length;
	        List<List<Integer>> res = new ArrayList<>();
	        Set<List<Integer>> set = new HashSet<>();
	        Arrays.sort(nums);
	        for(int i=0;i<n-3;i++){
	            if (i > 0 && nums[i] == nums[i - 1])
	                continue;
	            for(int j=i+1;j<n-2;j++){
	                if (j > i + 1 && nums[j] == nums[j - 1])
	                    continue;
	                int low = j+1, high = n-1;
	                    while(low<high){
	                        if (j + 1 < low && nums[low - 1] == nums[low]) {
	                            low++;
	                            continue;
	                        }
	                        long sum = (long) nums[i]+nums[j]+nums[low]+nums[high];
	                        if(sum==target){
	                                res.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
	                                low++;
	                                high--;
	                        } else if(sum<target)
	                            low++;
	                        else
	                            high--;
	                    }
	            }
	        }
	        // res.addAll(set);
	        return res;

	        // Arrays.sort(nums);
	        // for(int i=0;i<n-3;i++){
	        //     if(i>0&&nums[i]==nums[i-1])
	        //         continue;
	        //     for(int j=i+1;j<n-2;j++){
	        //         for(int k=j+1;k<n-1;k++){
	        //             for(int m=k+1;m<n;m++){
	        //                 long sum = (long)(nums[i]+nums[j]+nums[k]+nums[m]);
	        //                 if(sum==target){
	        //                     if(!set.contains(Arrays.asList(nums[i],nums[j],nums[k],nums[m]))){
	        //                         res.add(Arrays.asList(nums[i],nums[j],nums[k],nums[m]));
	        //                         set.add(Arrays.asList(nums[i],nums[j],nums[k],nums[m]));
	        //                     }
	        //                 }
	        //             }
	        //         }
	        //     }
	        // }
	        // return res;
	    }
	}
}
