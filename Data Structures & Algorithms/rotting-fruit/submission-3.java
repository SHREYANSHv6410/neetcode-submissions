class Solution {
    public int orangesRotting(int[][] grid) {
        int[] pos=new int[2];
        int fresh=0;
        Queue<int[]> q=new LinkedList<>();
        int[][] dirs={{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int count=0;
        while(!q.isEmpty() && fresh>0){
            int size=q.size();
            for(int i=0;i<size;i++){
            int[] curr=q.poll();
            int r=curr[0];
            int c=curr[1];
            for(int[] dir:dirs){
                
                int nr=r+dir[0];
                int nc=c+dir[1];
                if(nr<0 || nc<0 || nr>=grid.length || nc>=grid[0].length){
                    continue;
                }
                if(grid[nr][nc]==1){
                    q.offer(new int[]{nr,nc});
                    grid[nr][nc]=2;
                    fresh--;
                }
            }
        }
        count++;
        }
        if(fresh==0){
            return count;
        }
        return -1;
    }
}
