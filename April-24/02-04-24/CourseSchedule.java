package com.leetcode.April;

//Problem Link: https://leetcode.com/problems/course-schedule/description/
// O(V+E) O(V+E)
public class CourseSchedule {
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		if (prerequisites == null || prerequisites.length == 0)
			return true;
		Map<Integer, List<Integer>> map = new HashMap<>();
		int[] indegree = new int[numCourses];
		int cnt = 0;
		for (int i = 0; i < prerequisites.length; i++) {
			indegree[prerequisites[i][0]]++;
			if (!map.containsKey(prerequisites[i][1]))
				map.put(prerequisites[i][1], new ArrayList<>());
			map.get(prerequisites[i][1]).add(prerequisites[i][0]);
		}

		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < numCourses; i++) {
			if (indegree[i] == 0) {
				q.add(i);
				cnt++;
			}
		}
		if (q.isEmpty())
			return false;
		while (!q.isEmpty()) {
			int cur = q.poll();
			List<Integer> li = map.get(cur);
			if (li != null) {
				for (int child : li) {
					indegree[child]--;
					if (indegree[child] == 0) {
						q.add(child);
						cnt++;
						if (cnt == numCourses)
							return true;
					}
				}
			}
		}
		return false;
	}
}
