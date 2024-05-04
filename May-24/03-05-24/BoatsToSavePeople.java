package com.leetcode.May;

//Problem Link: https://leetcode.com/problems/boats-to-save-people/description
//O(nlogn) O(1)
public class BoatsToSavePeople {
	class Solution {
		public int numRescueBoats(int[] people, int limit) {
			Arrays.sort(people);
			int st = 0;
			int end = people.length - 1;
			int boats = 0;

			while (st <= end) {
				if (people[st] + people[end] <= limit) {
					st++;
				}
				end--;
				boats++;
			}

			return boats;
		}
	}
}
