Problem Link: https://leetcode.com/problems/number-of-provinces/description/

Time Complexity: O(n)
Space Complexity: O(2n)

class Solution {
    public int findCircleNum(int[][] mat) {
        int n=mat.length;
        // Map<Integer, List<Integer>> map=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i!=j && isConnected[i][j]==1){
        //             if(!map.containsKey(i)){
        //                 map.put(i, new ArrayList<>());
        //             }
        //             map.get(i).add(j);
        //         }
        //     }
        // }
        int cnt=0;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                cnt++;
                dfs(visited, mat, i);
            }
        }
        return cnt;

    }
    private void dfs(boolean[] visited, int[][] mat, int cur){
        visited[cur]=true;
        for(int i=0;i<mat.length;i++){
            if(!visited[i] && mat[cur][i]==1)
                dfs(visited, mat, i);
        }
    }
}