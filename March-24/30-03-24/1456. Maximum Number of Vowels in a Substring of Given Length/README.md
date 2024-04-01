Problem Link: https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/

Time Complexity: O(n)
Space Complexity: O(1)

class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        int c=0;
        for(int i=0;i<k;i++){
            if(isvowel(s.charAt(i)))
            c++;
        }
        max=c;
        for(int i=k;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                c++;
            }
            if(isvowel(s.charAt(i-k))){
                c--;
            }
            max=Math.max(max,c);
        }
        return max;
    }
    public boolean isvowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}