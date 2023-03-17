from itertools import accumulate
from bisect import bisect_right

'''
/**
 * Mar 17 2023
 * Leetcode_2389
 * Written by Java
 * Author: LukeLong
 */

/**
 * 给你一个长度为 n 的整数数组 nums ，和一个长度为 m 的整数数组 queries 。
 * 
 * 返回一个长度为 m 的数组 answer ，其中 answer[i] 是 nums 中 元素之和小于等于 queries[i] 的 子序列 的 最大
 * 长度  。
 * 
 * 子序列 是由一个数组删除某些元素（也可以不删除）但不改变剩余元素顺序得到的一个数组。
 * 
 * 前缀和 + 二分法
 * 时间 O(n + m)* O(nlogn)
 * 空间 O(n)
 */
 '''


def answerQueries(self, nums: list[int], queries: list[int]) -> list[int]:
    f = list(accumulate(sorted(nums)))
    return [bisect_right(f, q) for q in queries]


def main():
    print(answerQueries(any, [4, 5, 2, 1], [3, 10, 21]))


if __name__ == '__main__':
    main()
