/**
 * Sep 19 2022
 * Leetcode_1636
 * Written by Java
 */

/**
    给你一个整数数组 nums ，请你将数组按照每个值的频率 升序 排序。
    如果有多个值的频率相同，请你按照数值本身将它们 降序 排序。 
    请你返回排序后的数组
 * 
 * 哈希 + 排序
 * 时间复杂度: O(2n)
 * 空间复杂度: O(n)
 */

import java.util.*;

class Leetcode_1636 {
    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<int[]> list = new ArrayList<>();
        for (int key : map.keySet()) {
            list.add(new int[] { key, map.get(key) });
        }
        Collections.sort(list, (a, b) -> {
            return a[1] != b[1] ? a[1] - b[1] : b[0] - a[0];
        });

        int[] res = new int[nums.length];
        int index = 0;
        for (int[] num : list) {
            int a = num[0], b = num[1];
            while (b-- > 0)
                res[index++] = a;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] test = new int[] { -1, 1, -6, 4, 5, -6, 1, 4, 1 };
        int[] res = frequencySort(test);
        for (int n : res) {
            System.out.print(n + " ");
        }
    }
}