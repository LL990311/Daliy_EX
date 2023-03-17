package Java_version;

import java.util.*;

/**
 * Mar 17 2023
 * Leetcode_2389
 * Written by Java
 * Author: LukeLong
 */

/**
 * 给你一个长度为 n 的整数数组 nums ，和一个长度为 m 的整数数组 queries 。
 * 
 * 返回一个长度为 m 的数组 answer ，其中 answer[i] 是 nums 中 元素之和小于等于 queries[i] 的 子序列 的 最大
 * 长度  。
 * 
 * 子序列 是由一个数组删除某些元素（也可以不删除）但不改变剩余元素顺序得到的一个数组。
 * 
 * 前缀和 + 二分法
 * 时间 O(n + m)* O(nlogn)
 * 空间 O(n)
 */

public class leetcode2389 {
    public static int[] answerQueries(int[] nums, int[] queries) {
        int[] res = new int[queries.length];
        Arrays.sort(nums);
        int[] f = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            f[i + 1] = f[i] + nums[i];
        }
        for (int i = 0; i < queries.length; i++) {
            res[i] = bs(f, queries[i]) - 1;
        }
        return res;
    }

    static int bs(int[] f, int t) {
        int l = 1, h = f.length;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (f[mid] > t)
                h = mid;
            else
                l = mid + 1;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] res = answerQueries(new int[] { 4, 5, 2, 1 }, new int[] { 3, 10, 21 });
        for (int i : res)
            System.out.print(i + " ");
        System.out.println();
    }
}
