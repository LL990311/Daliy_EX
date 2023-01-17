package Java_version;

import java.util.*;

/**
 * Jan 17 2023
 * leetcode_1814
 * Written by Java
 */

/*
 * 给你一个数组 nums ，数组中只包含非负整数。定义 rev(x) 的值为将整数 x 各个数字位反转得到的结果。比方说 rev(123) =
 * 321 ， rev(120) = 21 。我们称满足下面条件的下标对 (i, j) 是 好的 ：
 * 
 * 0 <= i < j < nums.length
 * nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])
 * 请你返回好下标对的数目。由于结果可能会很大，请将结果对 109 + 7 取余 后返回。
 * 
 */

/*
 * 时间 O(n + logC) 其中 n 为数组 nums 的长度，C 为数组 nums 中的数字范围。其中 O(\log C)O(logC) 为反转数位的时间复杂度。
 * 空间 O(n)
 */

public class leetcode1814 {
    public static int countNicePairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int num : nums) {
            int temp = num, cur = 0;
            while (temp > 0) {
                cur = cur * 10 + temp % 10;
                temp /= 10;
            }
            res = (res + map.getOrDefault(num - cur, 0)) % 1000000007;
            map.put(num - cur, map.getOrDefault(num - cur, 0) + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] test = new int[] { 42, 11, 1, 97 };
        System.out.println(countNicePairs(test)); // 2
    }
}
