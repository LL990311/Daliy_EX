package Java_version;

import java.util.*;

/**
 * Feb 14 2022
 * Leetcode_1124
 * Written by Java
 */

/**
 * 给你一份工作时间表 hours，上面记录着某一位员工每天的工作小时数。
 * 
 * 我们认为当员工一天中的工作小时数大于 8 小时的时候，那么这一天就是「劳累的一天」。
 * 
 * 所谓「表现良好的时间段」，意味在这段时间内，「劳累的天数」是严格 大于「不劳累的天数」。
 * 
 * 请你返回「表现良好时间段」的最大长度。
 * 
 * 前缀和 + 哈希表
 * 时间复杂度: O(n)
 * 空间复杂度: O(n)
 */

public class leetcode1124 {
    public static int longestWPI(int[] hours) {
        int n = hours.length;
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0, s = 0;
        for (int i = 0; i < n; i++) {
            s += hours[i] > 8 ? 1 : -1;
            if (s > 0) {
                res = Math.max(res, i + 1);
            } else {
                if (map.containsKey(s - 1)) {
                    res = Math.max(res, i - map.get(s - 1));
                }
            }
            if (!map.containsKey(s)) {
                map.put(s, i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(longestWPI(new int[] { 9, 9, 6, 0, 6, 6, 9 })); // 3
    }
}
