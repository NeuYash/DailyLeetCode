package com.leetcode.April;
//Problem Link:https://leetcode.com/problems/number-of-students-unable-to-eat-lunch
//O(2n) O(1)
public class StudentsUnableToEatLunch {
	class Solution {
	    public int countStudents(int[] students, int[] sandwiches) {
	        int circularStud=0, squareStud=0;
	        for(int stud: students)
	            if(stud==0)
	                circularStud++;
	            else
	                squareStud++;
	        
	        for(int sand: sandwiches){
	            if(sand==0 && circularStud>0)
	                circularStud--;
	            else if(sand==1 && squareStud>0)
	                squareStud--;
	            else
	                return circularStud+squareStud;
	        }
	        return 0;
	    }
	}
}
