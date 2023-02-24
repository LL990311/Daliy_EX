package Java_version;

import java.util.*;

/**
 * Feb 24 2023
 * leetcode_2357
 * Written by Java
 */

/**
 * 给你一个非负整数数组 nums 。在一步操作中，你必须：
 * 
 * 选出一个正整数 x ，x 需要小于或等于 nums 中 最小 的 非零 元素。
 * nums 中的每个正整数都减去 x。
 * 返回使 nums 中所有元素都等于 0 需要的 最少 操作数。
 * 
 * 哈希表
 * 时间 O(n)
 * 空间 O(n)
 */
 
public class leetcode2357 {
    public static int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (n > 0) {
                set.add(n);
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[] {1,5,0,3,5})); // 3
    }
}
      