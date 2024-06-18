package com.leetcode;

//O(n) O(1)
public class ReduceBinaryToOne {
	class Solution {
		public int numSteps(String s) {
			int carry = 0, ans = 0, n = s.length();
			// from end to start
			for (int i = n - 1; i >= 1; i--) {
				if (((int) (s.charAt(i) - '0') + carry) % 2 == 1) { // if(end bit + carry is 1) means odd
					ans += 2; // then 2 operations, add 1, then right shift.
					carry = 1;
				} else
					ans += 1; // if not 1 means already even, then just right shift. so 1 opr.
			}
			return ans + carry; // if in case like 10 and carry 1, then we have to do 2 operations, if carry 0
								// then 1 operation, so just add carry to ans;
		}
	}
}
