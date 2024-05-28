package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//O(nlogn) O(1)
public class SortPeople {
	class Solution {
		public String[] sortPeople(String[] names, int[] heights) {
			Map<Integer, String> map = new HashMap<>();
			for (int i = 0; i < names.length; i++)
				map.put(heights[i], names[i]);

			Arrays.sort(heights);
			int idx = 0;
			for (int i = heights.length - 1; i >= 0; i--) {
				names[idx++] = map.get(heights[i]);
			}
			return names;
		}
	}
}
