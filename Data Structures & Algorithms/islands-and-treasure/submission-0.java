class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    q.offer(new int[]{i,j});
                }
            }
        }
        int[][] dirs={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int r=curr[0];
            int c=curr[1];
        for(int[] d:dirs){
            int nr=r+d[0];
            int nc=c+d[1];
            if(nr<0 || nc<0 || nr>=grid.length || nc>=grid[0].length){
                continue;
            }
            
            if (grid[nr][nc] != Integer.MAX_VALUE) {
                    continue;
                }
            grid[nr][nc]=grid[r][c]+1;
            q.offer(new int[]{nr,nc});
            
        }
        }
    }
}
