package Java_version;

import java.util.*;

/**
 * Feb 16 2023
 * leetcode_2341
 * Written by Java
 */

/**
 * 给你一个下标从 0 开始的整数数组 nums 。在一步操作中，你可以执行以下步骤：
 * 
 * 从 nums 选出 两个 相等的 整数
 * 从 nums 中移除这两个整数，形成一个 数对
 * 请你在 nums 上多次执行此操作直到无法继续执行。
 * 
 * 返回一个下标从 0 开始、长度为 2 的整数数组 answer 作为答案，其中 answer[0] 是形成的数对数目，answer[1] 是对 nums
 * 尽可能执行上述操作后剩下的整数数目。
 * 
 */

public class leetcode2341 {
    public static int[] numberOfPairs(int[] nums) {
        int res = 0;
        Map<Integer, Boolean> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, !map.getOrDefault(n, false));
            if (!map.get(n)) {
                res++;
            }
        }
        return new int[] { res, nums.length - 2 * res };
    }

    public static void main(String[] args) {
        int[] test = new int[] {1,3,2,1,3,2,2};
        int[] res = numberOfPairs(test);
        System.out.println(res[0] + " " + res[1]); // 3 1
    }
}
