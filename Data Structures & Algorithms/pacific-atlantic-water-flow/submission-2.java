

class Solution {

    int m, n;

    public void dfs(int row, int col, int[][] heights,
                    boolean[][] visited) {

        visited[row][col] = true;

        int[][] dirs = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };

        for (int[] d : dirs) {
            int nr = row + d[0];
            int nc = col + d[1];

            if (nr < 0 || nc < 0 || nr >= m || nc >= n) {
                continue;
            }

            if (visited[nr][nc]) {
                continue;
            }

            if (heights[nr][nc] >= heights[row][col]) {
                dfs(nr, nc, heights, visited);
            }
        }
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        m = heights.length;
        n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

    
        for (int c = 0; c < n; c++) {
            dfs(0, c, heights, pacific);
        }

        for (int r = 0; r < m; r++) {
            dfs(r, 0, heights, pacific);
        }

    
        for (int c = 0; c < n; c++) {
            dfs(m - 1, c, heights, atlantic);
        }

        for (int r = 0; r < m; r++) {
            dfs(r, n - 1, heights, atlantic);
        }

        List<List<Integer>> sol = new ArrayList<>();

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (pacific[r][c] && atlantic[r][c]) {
                    sol.add(Arrays.asList(r, c));
                }
            }
        }

        return sol;
    }
}