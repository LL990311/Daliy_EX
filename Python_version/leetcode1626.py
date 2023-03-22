'''
/**
 * Mar 22 2023
 * Leetcode1626
 * Written by Python
 * Author: ll
 */

/**
 * 
 * 假设你是球队的经理。对于即将到来的锦标赛，你想组合一支总体得分最高的球队。球队的得分是球队中所有球员的分数 总和 。
 * 
 * 然而，球队中的矛盾会限制球员的发挥，所以必须选出一支 没有矛盾 的球队。如果一名年龄较小球员的分数 严格大于
 * 一名年龄较大的球员，则存在矛盾。同龄球员之间不会发生矛盾。
 * 
 * 给你两个列表 scores 和 ages，其中每组 scores[i] 和 ages[i] 表示第 i 名球员的分数和年龄。请你返回
 * 所有可能的无矛盾球队中得分最高那支的分数 。
 * 
 * 时间 O(n^2)
 * 空间 O(n)
 */
'''


def bestTeamScore(self, scores: list[int], ages: list[int]) -> int:
    s_a = sorted(zip(scores, ages))
    dp = [0] * len(scores)
    for i, (score, age) in enumerate(s_a):
        for j in range(i):
            if (s_a[j][1] <= age):
                dp[i] = max(dp[i], dp[j])
        dp[i] += score
    return max(dp)


def main():
    print(bestTeamScore(any, [1, 3, 5, 10, 15], [1, 2, 3, 4, 5]))


if __name__ == '__main__':
    main()
