package Java_version;

import java.util.*;

/**
 * Jan 11 2023
 * leetcode_2283
 * Written by Java
 */

/*
 * 给你一个下标从 0 开始长度为 n 的字符串 num ，它只包含数字。
 * 
 * 如果对于 每个 0 <= i < n 的下标 i ，都满足数位 i 在
 * num 中出现了 num[i]次，那么请你返回 true ，否则返回 false 。
 * 
 */

public class leetcode2283 {
    public static boolean digitCount(String num) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length(); i++) {
            int cur = num.charAt(i) - '0';
            map.put(cur, map.getOrDefault(cur, 0) + 1);
        }
        for (int i = 0; i < num.length(); i++) {
            int cur = num.charAt(i) - '0';
            if (map.getOrDefault(i, 0) != cur) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(digitCount("1210")); // true
        System.out.println(digitCount("030")); // false
    }
}