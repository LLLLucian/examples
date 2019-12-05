package Algorithm.DP;

/**
 * Created by Elvis on 2019/12/5.
 */
public class M64_Minimum_Path_Sum {
    public int minPathSum(int[][] grid) {
        //初始化
        for (int i = 1; i < grid.length; i++) {
            grid[i][0] += grid[i - 1][0];
        }
        for (int j = 1; j < grid[0].length; j++) {
            grid[0][j] += grid[0][j - 1];
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[i].length; j++) {
                grid[i][j] += Math.min(grid[i][j - 1], grid[i -1][j]);
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }
}