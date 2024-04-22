package com.leetcode.April;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

//Problem Link: https://leetcode.com/problems/open-the-lock/
public class OpenLock {
	// Struct to represent the pair of next and previous combinations
	class Combination {
		int nextNum;
		int prevNum;

		Combination(int nextNum, int prevNum) {
			this.nextNum = nextNum;
			this.prevNum = prevNum;
		}
	}

	class Solution {
		// Helper function to get next and previous combinations
		private Combination getCombination(int comb, int wheelIndex) {
			int num = (comb % (int) Math.pow(10, wheelIndex + 1)) / (int) Math.pow(10, wheelIndex);
			int nextNum = comb - num * (int) Math.pow(10, wheelIndex)
					+ ((num + 1) % 10) * (int) Math.pow(10, wheelIndex);
			int prevNum = comb - num * (int) Math.pow(10, wheelIndex)
					+ ((num - 1 + 10) % 10) * (int) Math.pow(10, wheelIndex);
			return new Combination(nextNum, prevNum);
		}

		public int openLock(String[] deadends, String targetStr) {
			int startCombination = 0;
			int target = Integer.parseInt(targetStr);
			int totalWheels = 4;

			// Visited combinations for efficient lookups
			Set<Integer> visitedCombinations = new HashSet<>();
			for (String comb : deadends) {
				visitedCombinations.add(Integer.parseInt(comb));
			}

			// Check if starting or target positions are blocked
			if (visitedCombinations.contains(startCombination) || visitedCombinations.contains(target)) {
				return -1;
			}

			// BFS queue for level-order traversal
			Queue<Integer> combinations = new LinkedList<>();
			combinations.offer(startCombination);
			visitedCombinations.add(startCombination);

			int steps = 0;
			while (!combinations.isEmpty()) {
				int combinationSize = combinations.size();

				for (int i = 0; i < combinationSize; i++) {
					int currCombination = combinations.poll();

					if (currCombination == target) {
						return steps;
					}

					for (int wheelIndex = 0; wheelIndex < totalWheels; wheelIndex++) {
						Combination newCombs = getCombination(currCombination, wheelIndex);

						if (!visitedCombinations.contains(newCombs.nextNum)) {
							combinations.offer(newCombs.nextNum);
							visitedCombinations.add(newCombs.nextNum);
						}

						if (!visitedCombinations.contains(newCombs.prevNum)) {
							combinations.offer(newCombs.prevNum);
							visitedCombinations.add(newCombs.prevNum);
						}
					}
				}
				steps++;
			}

			return -1;
		}
	}
}
