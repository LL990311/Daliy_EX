package Java_version;
/**
 * Sep 27 2022
 * Leetcode_M1_2
 * Written by Java
 */

/**
 * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 * 模拟
 * 时间复杂度: O(n)
 * 空间复杂度: O(1)
 */

public class leetcodeM1_2 {
    public static boolean CheckPermutation(String s1, String s2) {
        int n = s1.length(), m = s2.length(), res = 0;
        if (n != m) return false;
        int[] cnt = new int[128];
        for (int i = 0; i < n; i++) {
            if (++cnt[s1.charAt(i)] == 1) res++;
            if (--cnt[s2.charAt(i)] == 0) res--;
        }
        return res == 0;
    }

    public static void main(String[] args) {
        String s1 = "abcdes", s2 = "esdacb";
        System.out.println(CheckPermutation(s1, s2));// true
        s1 = "abcdesa"; s2 = "esdacbb";
        System.out.println(CheckPermutation(s1, s2));//false
    }
}
