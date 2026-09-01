class Solution {
    public int dfs(int row,int col, int[][] grid, boolean[][] visited,int count){
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col]==0 || visited[row][col]==true){
            return 0;
        }
        count++;
        visited[row][col]=true;
        return (1+dfs(row+1,col,grid,visited,count)+dfs(row-1,col,grid,visited,count)+dfs(row,col+1,grid,visited,count)+dfs(row,col-1,grid,visited,count));
        
    }
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        int max=-1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int count_new=dfs(i,j,grid,visited,0);
                if(count_new>max){
                    max=count_new;
                }
            }
        }
        return max;
    }
}
