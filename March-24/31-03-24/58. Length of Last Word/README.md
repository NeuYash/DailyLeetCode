Problem Link: https://leetcode.com/problems/length-of-last-word/description/

Time Complexity: O(2n)
Space Complexity: O(1)

class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int cnt=1;
        int idx=0;
        while(idx<s.length()){
            char cur=s.charAt(idx++);
            if(cur==' '){
                cnt=0;
            }
            cnt++;
        }
        return cnt-1;
    }
}