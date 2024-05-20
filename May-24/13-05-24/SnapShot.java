package com.leetcode.May;
//Problem Link: https://leetcode.com/problems/snapshot-array/
public class SnapShot {
	class SnapshotArray {
	    List<Map<Integer, Integer>> snapMap;
	    Map<Integer, Integer> map;
	    public SnapshotArray(int length) {
	        this.snapMap = new ArrayList<>(length);
	        this.map = new HashMap<>(length);
	    }
	    
	    public void set(int index, int val) {
	        map.put(index, val);
	    }
	    
	    public int snap() {
	        snapMap.add(map);
	        map = new HashMap<>();
	        return snapMap.size()-1;
	    }
	    
	    public int get(int index, int snap_id) {
	        for (int i = snap_id; i >= 0; --i)
	             if (snapMap.get(i).containsKey(index))   
	                return snapMap.get(i).get(index); 
	        return 0;
	    }
	}

	/**
	 * Your SnapshotArray object will be instantiated and called as such:
	 * SnapshotArray obj = new SnapshotArray(length);
	 * obj.set(index,val);
	 * int param_2 = obj.snap();
	 * int param_3 = obj.get(index,snap_id);
	 */
}
