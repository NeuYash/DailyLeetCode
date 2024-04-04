package com.leetcode.April;
//Problem Link: https://leetcode.com/problems/detonate-the-maximum-bombs/description/
//O(n^3) O(n^2)
public class DetonateMaximumBombs {
	public int maximumDetonation(int[][] bombs) {
        int n=bombs.length;
        List<List<Integer>> adjLi=new ArrayList<>();
        for(int i=0;i<n;i++){
            long curx=bombs[i][0];
            long cury=bombs[i][1];
            long curR=bombs[i][2];
            adjLi.add(new ArrayList<>());
            for(int j=0;j<n;j++){
                if(i!=j){
                    long nx=bombs[j][0];
                    long ny=bombs[j][1];
                    long dist=(nx-curx)*(nx-curx)+(ny-cury)*(ny-cury);
                    if(dist<=(long)curR*curR){
                        adjLi.get(i).add(j);
                    }
                }
            }
        }

        int res=1;
        for(int i=0;i<n;i++){
            // res=Math.max(res, dfs(adjLi, i, new boolean[n]));
            res=Math.max(res, bfs(adjLi, i, new boolean[n]));
        }
        return res;
    }
    public int dfs(List<List<Integer>> adj , int source,boolean[] visited){
        visited[source] = true;
        int res = 1;
        for(int item : adj.get(source)){
            if(visited[item] == false){
                res += dfs(adj,item,visited);
            }
        }
        return res;
    }
    public int bfs(List<List<Integer>> lst, int i, boolean[] flag) {
        int res = 0;
        Queue<Integer> que = new LinkedList<>();
        boolean[] cur_vis = new boolean[lst.size()];
        que.add(i);
        flag[i] = true;
        cur_vis[i]=true;
        res++;
        while (!que.isEmpty()) {
            int bmb = que.poll();
            for (int tmp : lst.get(bmb)) {
                if (!cur_vis[tmp]) {
                    que.add(tmp);
                    res++;
                    cur_vis[tmp] = true;
                    flag[tmp] = true;
                }
            }
        }
        return res;
    }
}
