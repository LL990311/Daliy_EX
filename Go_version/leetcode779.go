/**
 * Oct 20 2022
 * Leetcode_12
 * Written by Go
 */

/**
 * 我们构建了一个包含 n 行( 索引从 1  开始 )的表。首先在第一行我们写上一个 0。接下来的每一行，将前一行中的0替换为01，1替换为10。
 * 
 * 例如，对于 n = 3 ，
 * 第 1 行是 0 ，
 * 第 2 行是 01 ，
 * 第 3 行是 0110 。
 * 给定行数 n 和序数 k，返回第 n 行中第 k 个字符。（ k 从索引 1 开始）
 * 
 * 逻辑位运算
 * 时间复杂度: O(1)
 * 空间复杂度: O(1)
 */

package main
import "fmt"

func kthGrammar(n int, k int) int {
    res := 0
    for k--; k > 0; k &= k - 1 {
        res ^= 1
    }
    return res
}

func main() {
	res := kthGrammar(2, 2)
	fmt.Println(res) // 1
}