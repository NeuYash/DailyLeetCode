package com.leetcode;

//O(n) O(n)
public class FindAllAnagrams {
	class Solution {
		public List<Integer> findAnagrams(String s, String p) {
			List<Integer> res = new ArrayList<>();
			Map<Character, Integer> map = new HashMap<>();
			int n = p.length();
			for (char c : p.toCharArray())
				map.put(c, map.getOrDefault(c, 0) + 1);

			int match = 0;
			for (int i = 0; i < s.length(); i++) {
				char in = s.charAt(i);
				if (map.containsKey(in)) {
					map.put(in, map.get(in) - 1);
					if (map.get(in) == 0)
						match++;
				}
				if (i >= n) {
					char out = s.charAt(i - n);
					if (map.containsKey(out)) {
						map.put(out, map.get(out) + 1);
						if (map.get(out) == 1)
							match--;
					}
				}
				if (match == map.size())
					res.add(i - n + 1);
			}
			return res;
		}
	}
}
