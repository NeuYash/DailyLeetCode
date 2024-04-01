Problem Link: https://leetcode.com/problems/find-and-replace-in-string/description/

Time Complexity: O(n*l)
Space Complexity: O(1)

class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            boolean matched=false;

            for(int j=0;j<indices.length;j++){
                if(indices[j]==i && s.startsWith(sources[j], i)){
                    sb.append(targets[j]);
                    i+=sources[j].length()-1;
                    matched=true;
                }
            }

            if(!matched){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}