package Java_version;

/**
 * Mar 01 2023
 * Leetcode_2373
 * Written by Java
 */

/**
 * 给你一个大小为 n x n 的整数矩阵 grid 。
 * 
 * 生成一个大小为 (n - 2) x (n - 2) 的整数矩阵  maxLocal ，并满足：
 * 
 * maxLocal[i][j] 等于 grid 中以 i + 1 行和 j + 1 列为中心的 3 x 3 矩阵中的 最大值 。
 * 换句话说，我们希望找出 grid 中每个 3 x 3 矩阵中的最大值。
 * 
 * 返回生成的矩阵。
 * 
 * 模拟
 * 时间复杂度: O(n^2)
 * 空间复杂度: O(1)
 */

public class leetcode2373 {
    public static int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int size = 3;
        int[][] res = new int[n - size + 1][n - size + 1];

        for (int i = 0; i <= n - size; i++) {
            for (int j = 0; j <= n - size; j++) {
                res[i][j] = maxGridVal(grid, i, j, size);
            }
        }
        return res;

    }

    static int maxGridVal(int[][] grid, int i, int j, int size) {
        int max = grid[i][j];
        for (int p = i; p < i + size; p++) {
            for (int q = j; q < j + size; q++) {
                if (grid[p][q] >= max) {
                    max = grid[p][q];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] test = largestLocal(
                new int[][] { { 9, 9, 8, 1 }, { 5, 6, 2, 6 }, { 8, 2, 6, 4 }, { 6, 2, 2, 2, 2 } });
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[0].length; j++) {
                System.out.print(test[i][j] + " ");
            }
            System.out.println();
        }

    }
}
