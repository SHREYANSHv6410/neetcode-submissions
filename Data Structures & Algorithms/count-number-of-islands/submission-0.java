class Solution {
    public void dfs(int row, int col, char[][] grid,boolean[][] visited){
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col]=='0' || visited[row][col]==true){
            return ;
        }
        if(visited[row][col]==false){
        visited[row][col]=true;
        }
        dfs(row-1,col,grid,visited);
        dfs(row,col-1,grid,visited);
        dfs(row+1,col,grid,visited);
        dfs(row,col+1,grid,visited);
    }
    public int numIslands(char[][] grid) {
        int count=0;
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(visited[i][j]==false && grid[i][j]=='1'){
                count++;
                dfs(i,j,grid,visited);
                }
            }
        }
        return count;
    }
}
