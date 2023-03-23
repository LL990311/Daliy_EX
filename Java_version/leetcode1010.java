package Java_version;

import java.util.*;

/**
 * Mar 23 2023
 * Leetcode1010
 * Written by Java
 * Author: ll
 */

/**
 * 在歌曲列表中，第 i 首歌曲的持续时间为 time[i] 秒。
 * 
 * 返回其总持续时间（以秒为单位）可被 60 整除的歌曲对的数量。形式上，我们希望下标数字 i 和 j 满足  i < j 且有 (time[i] +
 * time[j]) % 60 == 0。
 * 
 * 时间 O(n)
 * 空间 O(1)
 */

public class leetcode1010 {
    public static int numPairsDivisibleBy60(int[] time) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int t : time) {
            int mod = t % 60;
            int diff = (60 - mod) % 60;
            res += map.getOrDefault(diff, 0);
            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(numPairsDivisibleBy60(new int[] { 30, 20, 150, 100, 40 }));
    }
}
