package com.leetcode;

import java.util.HashMap;
import java.util.Map;

//O(3n) O(1) 
public class CustomStringSort {
	class Solution {
		public String customSortString(String order, String s) {
			Map<Character, Integer> map = new HashMap<>();
			for (char cur : s.toCharArray()) {
				map.put(cur, map.getOrDefault(cur, 0) + 1);
			}

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < order.length(); i++) {
				char curChar = order.charAt(i);
				if (map.containsKey(curChar)) {
					int cnt = map.get(curChar);
					for (int j = 0; j < cnt; j++) {
						sb.append(curChar);
					}
					map.remove(curChar);
				}
			}

			for (char cur : map.keySet()) {
				int cnt = map.get(cur);
				for (int i = 0; i < cnt; i++) {
					sb.append(cur);
				}
			}
			return sb.toString();
		}
	}
}
