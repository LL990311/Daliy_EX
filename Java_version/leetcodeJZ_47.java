package Java_version;

/**
 * Mar 08 2023
 * LeetcodeJZ_47
 * Written by Java
 */

/**
 * 在一个 m*n 的棋盘的每一格都放有一个礼物，每个礼物都有一定的价值（价值大于0）
 * 你可以从棋盘的左上角开始拿格子里的礼物，
 * 并每次向右或者向下移动一格、直到到达棋盘的右下角。
 * 给定一个棋盘及其上面的礼物的价值，请计算你最多能拿到多少价值的礼物？
 * 
 * 动态规划
 * 时间复杂度: O(n^2)
 * 空间复杂度: O(1)
 */

public class leetcodeJZ_47 {
    public static int maxValue(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        for (int i = 1; i < m; i++) {
            grid[0][i] += grid[0][i - 1];
        }
        for (int i = 1; i < n; i++) {
            grid[i][0] += grid[i - 1][0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                grid[i][j] += Math.max(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[n - 1][m - 1];
    }

    public static void main(String[] args) {
        int[][] test = new int[][] { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
        System.out.println(maxValue(test)); // 12
    }
}
