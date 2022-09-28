/**
 * Sep 28 2022
 * Leetcode_M17_9
 * Written by Java
 */

/**
 * 有些数的素因子只有 3，5，7，请设计一个算法找出第 k 个数。注意，不是必须有这些素因子，而是必须不包含其他的素因子。
 * 例如，前几个数按顺序应该是 1，3，5，7，9，15，21。
 * 多指针
 * 时间复杂度: O(k)
 * 空间复杂度: O(k)
 */

public class leetcodeM17_9 {
    public int getKthMagicNumber(int k) {
        int[] ans = new int[k + 1];
        ans[1] = 1;
        for (int i3 = 1, i5 = 1, i7 = 1, i = 2; i <= k; i++) {
            int a = ans[i3] * 3, b = ans[i5] * 5, c = ans[i7] * 7;
            int min = Math.min(a, Math.min(b, c));
            if (min == a)
                i3++;
            if (min == b)
                i5++;
            if (min == c)
                i7++;
            ans[i] = min;
        }
        return ans[k];
    }
}
