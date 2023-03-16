package Java_version;

import java.util.*;

/**
 * Mar 16 2023
 * Leetcode_2488
 * Written by Java
 * Author: LukeLong
 */

/**
 * 
 * 给你一个长度为 n 的数组 nums ，该数组由从 1 到 n 的 不同 整数组成。另给你一个正整数 k 。
 * 统计并返回 nums 中的 中位数 等于 k 的非空子数组的数目。
 * 注意：
 * 
 * 数组的中位数是按 递增 顺序排列后位于 中间 的那个元素，
 * 如果数组长度为偶数，则中位数是位于中间靠 左 的那个元素。
 * 例如，[2,3,1,4] 的中位数是 2 ，[8,4,3,5,1] 的中位数是 4 。
 * 子数组是数组中的一个连续部分。
 * 
 */

public class leetcode2488 {
    public static int countSubarrays(int[] nums, int k) {
        int index_k = 0, sum = 0, res = 0;
        while (nums[index_k] != k)
            index_k++;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] - k > 0 ? -1 : 1;
            if (i < index_k) {
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            } else {
                int cur1 = map.getOrDefault(sum, 0);
                int cur2 = map.getOrDefault(sum - 1, 0);
                res += cur1 + cur2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countSubarrays(new int[] { 3, 2, 1, 4, 5 }, 4));
    }
}
