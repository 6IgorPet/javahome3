package thirdSemin;

public class homeTaskIslands {
    public static void main(String[] args) {
        class Solution {
            public int numIslands(char[][] grid) {
                int square = 0;
                for (int i = 0; i < grid.length; i++) {
                    for (int j = 0; j < grid[0].length; j++) {
                        if (grid[i][j] == '1') {
                            square++;
                            calculated(i, j, grid);
                        }
                    }
                }
                return square;
            }

            private int calculated(int i, int j, char[][] grid) {
                if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') return 0;
                grid[i][j] = '0';
                return 1 + calculated(i - 1, j, grid)
                        + calculated(i, j - 1, grid)
                        + calculated(i + 1, j, grid)
                        + calculated(i, j + 1, grid);
            }
        }
    }
}
 
