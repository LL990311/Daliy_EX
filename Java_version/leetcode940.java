package Java_version;
/**
 * Oct 14 2022
 * Leetcode_940
 * Written by Java
 */

/**
 * 给定一个字符串 s，计算 s 的 不同非空子序列 的个数。因为结果可能很大，所以返回答案需要对 10^9 + 7 取余 。
 * 字符串的 子序列 是经由原字符串删除一些（也可能不删除）字符但不改变剩余字符相对位置的一个新字符串。
 * 例如，"ace" 是 "abcde" 的一个子序列，但 "aec" 不是。
 * 动态规划
 * 时间复杂度: O(n)
 * 空间复杂度: O(1)
 */

public class leetcode940 {
    public static int distinctSubseqII(String s) {
        int MOD = (int)1e9+7;
        int n = s.length(), res = 0;
        int[] f = new int[26];
        for (int i = 0; i < n; i++) {
            int idx = s.charAt(i) - 'a', prev = f[idx];
            f[idx] = (res + 1) % MOD;
            res = (res + f[idx]) % MOD;
            res = (res - prev + MOD) % MOD;
        }
        return res;
    }

    public static void main(String[] args) {
        String tes = "abc";
        int res = distinctSubseqII(tes); //7
        System.out.println(res);
    }
}
