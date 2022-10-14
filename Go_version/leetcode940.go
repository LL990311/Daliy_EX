/*
给定一个字符串 s，计算 s 的 不同非空子序列 的个数。因为结果可能很大，所以返回答案需要对 10^9 + 7 取余 。
字符串的 子序列 是经由原字符串删除一些（也可能不删除）字符但不改变剩余字符相对位置的一个新字符串。

例如，"ace" 是 "abcde" 的一个子序列，但 "aec" 不是。

Oct 14 2022
*/

package main
import "fmt"

func distinctSubseqII(s string) int {
	const mod = 1e9 + 7
	f := make([]int,26)
	res := 0
	for _, v := range s {
		idx := v - 'a'
		prev := f[idx]
		f[idx] = (res + 1) % mod
		res = (res + f[idx]) % mod
		res = (res - prev + mod) % mod
	}
	return res
}

func main() {
	fmt.Println(distinctSubseqII("abc")) // 7
}