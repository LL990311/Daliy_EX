'''
/**
 * Mar 01 2023
 * Leetcode_2373
 * Written by Python
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
'''


def largestLocal(self, grid: list[list[int]]) -> list[list[int]]:
    n = len(grid)
    ans = [[0] * (n - 2) for _ in range(n-2)]
    for i in range(n-2):
        for j in range(n-2):
            ans[i][j] = max(grid[x][y] for x in range(i, i+3)
                    for y in range(j, j+3))
    return ans

def main():
    print(largestLocal(any,[[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]))

if __name__ == "__main__":
    main()