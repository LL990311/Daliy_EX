'''
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
'''

def maxValue(self, grid: list[list[int]]) -> int:
    m, n = len(grid), len(grid[0])
    for i in range(1, n):
        grid[0][i] += grid[0][i-1]
    for i in range(1, m):
        grid[i][0] += grid[i-1][0]
    for i in range(1, m):
        for j in range(1, n):
            grid[i][j] += max(grid[i-1][j], grid[i][j-1])
    return grid[-1][-1]


def main():
    print(maxValue(any, [[1, 3, 1], [1, 5, 1], [4, 2, 1]]))


if __name__ == "__main__":
    main()
