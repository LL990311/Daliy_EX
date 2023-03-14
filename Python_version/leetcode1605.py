'''
/**
 * Mar 14 2023
 * Leetcode_1605
 * Written by Java
 * Author: LukeLong
 */

/**
 * 
 * 给你两个非负整数数组 rowSum 和 colSum ，其中 rowSum[i] 是二维矩阵中第 i 行元素的和，
 * colSum[j] 是第 j 列元素的和。换言之你不知道矩阵里的每个元素，但是你知道每一行和每一列的和。
 * 请找到大小为 rowSum.length x colSum.length 的任意 非负整数 矩阵，
 * 且该矩阵满足 rowSum 和 colSum 的要求。
 * 请你返回任意一个满足题目要求的二维矩阵，题目保证存在 至少一个 可行矩阵。
 * 
 */
 '''


def restoreMatrix(self, rowSum: list[int], colSum: list[int]) -> list[list[int]]:
    m, n = len(rowSum), len(colSum)
    res = [[0] * n for _ in range(m)]
    i = j = 0
    while i < m and j < n:
        rv, cv = rowSum[i], colSum[j]
        if rv < cv:
            res[i][j] = rv
            colSum[j] -= rv
            i += 1
        else:
            res[i][j] = cv
            rowSum[i] -= cv
            j += 1
    return res


def main():
    print(restoreMatrix(any, [3, 8], [4, 7]))


if __name__ == "__main__":
    main()
