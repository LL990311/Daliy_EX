package Java_version;

/**
 * Dec 12 2022
 * Leetcode_1781
 * Written by Java
 */

/**
 * 一个字符串的 美丽值 定义为：出现频率最高字符与出现频率最低字符的出现次数之差。
 * 
 * 比方说，"abaacc" 的美丽值为 3 - 1 = 2 。
 * 给你一个字符串 s ，请你返回它所有子字符串的 美丽值 之和。
 * 
 * 模拟
 * 时间复杂度: O(c * n^3) c为s类型长度
 * 空间复杂度: O(c)
 */

class leetcode1781 {
    public static int beautySum(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] cnt = new int[26];
            int max = 0;
            for (int j = i; j < s.length(); j++) {
                cnt[s.charAt(j) - 'a']++;
                max = Math.max(max, cnt[s.charAt(j) - 'a']);
                int min = s.length();
                for (int k = 0; k < 26; k++) {
                    if (cnt[k] > 0) {
                        min = Math.min(min, cnt[k]);
                    }
                }
                res += max - min;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(beautySum("aabcb"));
    }
}