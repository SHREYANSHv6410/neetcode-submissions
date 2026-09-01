class Solution {
    public ArrayList<ArrayList<Integer>> makegraph(int[][] edges){
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<edges.length+1;i++){
            graph.add(new ArrayList<>());
        }
        return graph;
    }
    public boolean dfs(int node,int parent,boolean[] visited,ArrayList<ArrayList<Integer>> graph,int target){
        if(node==target){
            return true;
        }
        visited[node]=true;
        for(int n:graph.get(node)){
            if(!visited[n]){
                if(dfs(n,node,visited,graph,target)){
                    return true;
                }
            }
        }
        return false;
    }
    public int[] findRedundantConnection(int[][] edges) {
        ArrayList<ArrayList<Integer>> graph=makegraph(edges);
        
        int[] sol=new int[2];

        for(int[] edge:edges){
            boolean[] visited=new boolean[edges.length+1];
            int u=edge[0];
            int v=edge[1];

            if(dfs(u,v,visited,graph,v)){
                sol[0]=u;
                sol[1]=v;
            }
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        return sol;
    }
}
