package com.leetcode.April;
//Problem Link: https://leetcode.com/problems/employee-importance/description/

//O(n) O(n)
public class EmployeeImportance {
	/*
	// Definition for Employee.
	class Employee {
	    public int id;
	    public int importance;
	    public List<Integer> subordinates;
	};
	*/

	class Solution {
	    public int getImportance(List<Employee> employees, int id) {
	        Map<Integer, Employee> map=new HashMap<>();
	        for(Employee e: employees)
	            map.put(e.id, e);
	        
	        // Queue<Integer> q=new LinkedList<>();
	        // q.add(id);
	        // int res=0;
	        // while(!q.isEmpty()){
	        //     int curId=q.poll();
	        //     res+=map.get(curId).importance;
	        //     List<Integer> curList=map.get(curId).subordinates;
	        //     for(int sub: curList)
	        //         q.add(sub);
	        // }
	        // return res;

	        return dfs(id, map);
	    }
	    private int dfs(int id, Map<Integer, Employee> emp){
	        Employee e=emp.get(id);
	        int res=e.importance;
	        for(int sub: e.subordinates)
	            res+=dfs(sub, emp);
	        return res;
	    }
	}
}
