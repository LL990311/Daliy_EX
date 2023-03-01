package main

import "fmt"

/**
 * Mar 01 2023
 * Leetcode_2373
 * Written by Go
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

func largestLocal(grid [][]int) [][]int {
    n := len(grid)

    arr := make([][]int, n - 2)

	for i := 0; i < len(arr); i++ {
		arr[i] = make([]int, n - 2)
	}

    for i := 0; i < len(arr); i++ {
		for j := 0; j < len(arr[i]); j++ {
			arr[i][j] = max(grid, i, j)
		}
	}
    return arr
}

func max(grid [][] int, i, j int) int {
    m := grid[i][j]
    for p := i; p < i + 3; p++ {
        for q := j; q < j + 3; q++ {
            if (grid[p][q] >= m) {
                m = grid[p][q]
            }
        }
    }
    return m
}

func main(){
	test := [][]int{
		{9,9,8,1},
		{5,6,2,6},
		{8,2,6,4},
		{6,2,2,2},
	}
	fmt.Println(largestLocal(test))
}