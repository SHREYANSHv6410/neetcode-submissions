
class Solution {

    public void dfs(int row, int col, char[][] board, boolean[][] visited) {

        // Out-of-bounds check
        if (row < 0 || col < 0 ||
            row >= board.length || col >= board[0].length) {
            return;
        }

        // Stop if already visited or not an 'O'
        if (visited[row][col] || board[row][col] != 'O') {
            return;
        }

        // Mark this boundary-connected cell as safe
        visited[row][col] = true;
        board[row][col] = 'T';

        // Explore all four directions
        dfs(row + 1, col, board, visited);
        dfs(row - 1, col, board, visited);
        dfs(row, col + 1, board, visited);
        dfs(row, col - 1, board, visited);
    }

    public void solve(char[][] board) {

        if (board.length == 0 || board[0].length == 0) {
            return;
        }

        int rows = board.length;
        int cols = board[0].length;

        boolean[][] visited = new boolean[rows][cols];

        // Traverse left and right boundaries
        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O') {
                dfs(i, 0, board, visited);
            }

            if (board[i][cols - 1] == 'O') {
                dfs(i, cols - 1, board, visited);
            }
        }

        // Traverse top and bottom boundaries
        for (int j = 0; j < cols; j++) {
            if (board[0][j] == 'O') {
                dfs(0, j, board, visited);
            }

            if (board[rows - 1][j] == 'O') {
                dfs(rows - 1, j, board, visited);
            }
        }

        // Flip surrounded regions and restore safe regions
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == 'T') {
                    board[i][j] = 'O';
                }
            }
        }
    }
}
