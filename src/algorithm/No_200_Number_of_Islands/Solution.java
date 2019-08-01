package algorithm.No_200_Number_of_Islands;

class Solution {
	public int numIslands(char[][] grid) {

		// Approach 2
		// N is the number of the element in the grid
		// Time Complexity: O(N)
		// Space Complexity: O(N)
		// Notes: DFS

		// Edge
		if (grid == null || grid.length == 0)
			return 0;

		int res = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1') {
					sink(grid, i, j);
					res++;
				}
			}
		}
		return res;
	}

	// Helper
	public void sink(char[][] grid, int r, int c) {
		int height = grid.length;
		int width = grid[0].length;
		if (r >= 0 && r < height && c >= 0 && c < width && grid[r][c] == '1') {
			grid[r][c] = '0';
			sink(grid, r + 1, c);
			sink(grid, r - 1, c);
			sink(grid, r, c + 1);
			sink(grid, r, c - 1);
		}
	}

}
