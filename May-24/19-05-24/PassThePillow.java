//O(1) O(1)
//Problem Link:https://leetcode.com/problems/pass-the-pillow/
public class PassThePillow {
	class Solution {
	    public int passThePillow(int n, int time) {
	        // int idx = 1;
	        // boolean flag =true;
	        // while(time-->0){
	        //     if(idx==n){
	        //         flag = false;
	        //     }else if(idx == 1)
	        //         flag = true;
	        //     if(flag)
	        //         idx++;
	        //     else
	        //         idx--;
	        // }
	        // return idx;

	        int num=(time/(n-1));
	        if(n>time){
	            return time+1;
	        }
	        if(num%2==1){
	            return n-((time%(n-1)));
	        }
	            
	        return (time%(n-1))+1;
	    }
	}
}
