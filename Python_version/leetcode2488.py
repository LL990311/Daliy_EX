from collections import Counter

'''
/**
 * Mar 16 2023
 * Leetcode_2488
 * Written by Java
 * Author: LukeLong
 */

/**
 * 
 * 给你一个长度为 n 的数组 nums ，该数组由从 1 到 n 的 不同 整数组成。另给你一个正整数 k 。
 * 统计并返回 nums 中的 中位数 等于 k 的非空子数组的数目。
 * 注意：
 * 
 * 数组的中位数是按 递增 顺序排列后位于 中间 的那个元素，
 * 如果数组长度为偶数，则中位数是位于中间靠 左 的那个元素。
 * 例如，[2,3,1,4] 的中位数是 2 ，[8,4,3,5,1] 的中位数是 4 。
 * 子数组是数组中的一个连续部分。
 * 
 */
'''


def countSubarrays(self, nums: list[int], k: int) -> int:
    res, c, index_k = 0, 0, nums.index(k)
    count = Counter()
    count[0] = 1
    for i, v in enumerate(nums):
        c += -1 if v - k > 0 else 1
        if (i < index_k):
            count[c] += 1
        else:
            cur1 = count[c]
            cur2 = count[c-1]
            res += cur1 + cur2
    return res


def main():
    print(countSubarrays(any, [3, 2, 1, 4, 5], 4))


if __name__ == '__main__':
    main()
