'''
Mar 06 2023
leetcode_1653
Written by Python


给你一个字符串 s ，它仅包含字符 'a' 和 'b'​​​​ 。

你可以删除 s 中任意数目的字符，使得 s 平衡 。当不存在下标对 (i,j) 满足 i < j ，且 s[i] = 'b' 的同时 s[j]= 'a' ，此时认为 s 是 平衡 的。

请你返回使 s 平衡 的 最少 删除次数。

模拟
时间 O(n)
空间 O(1)
'''

def minimumDeletions(self, s: str) -> int:
    res = count = s.count('a')
    for c in s:
        count -= 1 if c == 'a' else -1
        if (count < res):
            res = count
    return res


def main():
    print(minimumDeletions(any, "aababbab"))  # 2


if __name__ == "__main__":
    main()
