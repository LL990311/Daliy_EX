package Java_version;

import java.util.*;

/**
 * Feb 23 2023
 * Leetcode_1238
 * Written by Java
 */

/**
 * 给你两个整数 n 和 start。你的任务是返回任意 (0,1,2,,...,2^n-1) 的排列 p，并且满足：
 * 
 * p[0] = start
 * p[i] 和 p[i+1] 的二进制表示形式只有一位不同
 * p[0] 和 p[2^n -1] 的二进制表示形式也只有一位不同
 * 
 */

public class leetcode1238 {
    public static List<Integer> circularPermutation(int n, int start) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
            int grey = (i >> 1) ^ i;
            res.add(grey ^ start);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(circularPermutation(2, 3)); // 3,2,0,1
    }
}
