from collections import defaultdict

'''
/**
 * Mar 23 2023
 * Leetcode1010
 * Written by Java
 * Author: ll
 */

/**
 * 在歌曲列表中，第 i 首歌曲的持续时间为 time[i] 秒。
 * 
 * 返回其总持续时间（以秒为单位）可被 60 整除的歌曲对的数量。形式上，我们希望下标数字 i 和 j 满足  i < j 且有 (time[i] +
 * time[j]) % 60 == 0。
 * 
 * 时间 O(n)
 * 空间 O(1)
 */
'''


def numPairsDivisibleBy60(self, time: list[int]) -> int:
    m = defaultdict(int)
    res = 0
    for t in time:
        mod = t % 60
        diff = (60 - mod) % 60
        res += m[diff]
        m[mod] += 1
    return res


def main():
    print(numPairsDivisibleBy60(any, [30, 20, 150, 100, 40]))


if __name__ == '__main__':
    main()
