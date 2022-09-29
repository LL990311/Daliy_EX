/**
 * Sep 29 2022
 * Leetcode_M1_09
 * Written by Java
 */

/**
 * 字符串轮转。给定两个字符串s1和s2，
 * 请编写代码检查s2是否为s1旋转而成（比如，waterbottle是erbottlewat旋转后的字符串）。
 * Double s1字符串，检查s1字符串中是否存在子串s2
 * 时间复杂度: O(1)
 * 空间复杂度: O(1)
 */

public class leetcodeM1_09 {
    public static boolean isFlipedString(String s1, String s2) {
        return s1.length() == s2.length() && (s1 + s1).contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "waterbottle", s2 = "erbottlewat";
        System.out.println(isFlipedString(s1, s2));//true
        s1 = "aa"; s2 = "aba";
        System.out.println(isFlipedString(s1, s2));//false

    }
}
