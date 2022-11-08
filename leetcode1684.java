/**
 * Nov 08 2022
 * Leetcode_1684
 * Written by Java
 */

/**
 * 给你一个由不同字符组成的字符串 allowed 和一个字符串数组 words 。如果一个字符串的每一个字符都在 allowed 中，就称这个字符串是 一致字符串 。
 * 请你返回 words 数组中 一致字符串 的数目。
 * 暴力
 * 时间复杂度: O(n^2)
 * 空间复杂度: O(n)
 */

import java.util.*;

public class leetcode1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++)
            set.add(allowed.charAt(i));
        for (int i = 0; i < words.length; i++) {
            boolean flag = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (!set.contains(words[i].charAt(j))) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                res++;
            flag = true;
        }
        return res;
    }
}
