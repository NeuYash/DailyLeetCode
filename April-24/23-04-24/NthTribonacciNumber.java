package com.leetcode.April;

import java.util.HashMap;

//Problem Link:https://leetcode.com/problems/n-th-tribonacci-number
//O(n) O(n)
public class NthTribonacciNumber {
	class Solution {
		HashMap<Integer, Integer> hashmap = new HashMap<>();

		public int tribonacci(int n) {
			if (hashmap.containsKey(n)) {
				return hashmap.get(n);
			}
			if (n <= 0) {
				return 0;
			} else if (n <= 2) {
				return 1;
			} else {
				int ans = tribonacci(n - 3) + tribonacci(n - 2) + tribonacci(n - 1);
				hashmap.put(n, ans);
				return ans;
			}
		}
	}
}
