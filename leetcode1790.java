/**
 * Oct 11 2022
 * Leetcode_1780
 * Written by Java
 */

/**
 * 给你长度相等的两个字符串 s1 和 s2 。一次 字符串交换 操作的步骤如下：选出某个字符串中的两个下标（不必不同），
 * 并交换这两个下标所对应的字符。
 * 如果对 其中一个字符串 执行 最多一次字符串交换 就可以使两个字符串相等，返回 true ；否则，返回 false 。
 * 
 * 模拟
 * 时间复杂度: O(n)
 * 空间复杂度: O(1)
 */

public class leetcode1790 {
    public static boolean areAlmostEqual(String s1, String s2) {
        int a = -1, b = -1;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) continue;
            if (a == -1) a = i;
            else if (b == -1) b = i;
            else return false;
        }
        if (a == b && a == -1) return true;
        if (a == -1 || b == -1) return false;
        return s1.charAt(a) == s2.charAt(b) && s1.charAt(b) == s2.charAt(a);
    }

    public static void main(String[] args) {
        String s1 = "bank", s2 = "kanb";
        boolean res = areAlmostEqual(s1, s2); // true;
        System.out.println(res);
    }
}
