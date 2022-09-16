/**
 * Sep 16 2022
 * Leetcode_14
 * Written by Java
 */


/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
    如果不存在公共前缀，返回空字符串 ""。
 * 
 * 双指针解法
 * 时间复杂度: O(n)
 * 空间复杂度: O(n)
 */

public class leetcode14 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < strs[i].length() && j < res.length(); j++) {
                if (res.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            res = res.substring(0,j);
            if (res == "") return "";
        }
        return res;
    }

    public static void main(String[] args) {
        String[] test = new String[]{"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(test)); // "fl"
    }
}
