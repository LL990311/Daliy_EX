package Java_version;

/**
 * Feb 17 2022
 * Leetcode_1139
 * Written by Java
 */

/**
 * 
 * 给你一个由若干 0 和 1 组成的二维网格 grid，
 * 请你找出边界全部由 1 组成的最大 正方形 子网格，并返回该子网格中的元素数量。如果不存在，则返回 0。
 * 
 * 前缀和
 * 时间复杂度: O(mn * min(m,n))
 * 空间复杂度: O(mn)
 */

public class leetcode1139 {
    public static int largest1BorderedSquare(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] rs = new int[m][n + 1], cs = new int[n][m + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rs[i][j + 1] = rs[i][j] + grid[i][j];
                cs[j][i + 1] = cs[j][i] + grid[i][j];
            }
        }
        for (int d = Math.min(m, n); d > 0; --d) {
            for (int i = 0; i <= m - d; i++) {
                for (int j = 0; j <= n - d; j++) {
                    if (rs[i][j + d] - rs[i][j] == d &&
                            cs[j][i + d] - cs[j][i] == d &&
                            rs[i + d - 1][j + d] - rs[i + d - 1][j] == d &&
                            cs[j + d - 1][i + d] - cs[j + d - 1][i] == d)
                        return d * d;
                }
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        System.out.println(largest1BorderedSquare(
            new int[][]{{1,1,1},{1,0,1},{1,1,1}})); // 9
    }
}
