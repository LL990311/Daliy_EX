package Java_version;

import java.util.*;

/**
 * Mar 07 2023
 * Leetcode_16
 * Written by Java
 * 
 * Author @LukeLong
 */

/**
 * 给你一个长度为 n 的整数数组 nums 和 一个目标值 target。请你从 nums 中选出三个整数，使它们的和与 target 最接近。
 * 
 * 返回这三个数的和。
 * 
 * 假定每组输入只存在恰好一个解。
 * 
 * 双指针解法
 * 时间复杂度: O(n^2)
 * 空间复杂度: O(1)
 */

public class leetcode16 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[2];
        int ans = sum;
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1, end = nums.length - 1;
            while (start < end) {
                sum = nums[i] + nums[start] + nums[end];
                if (Math.abs(target - sum) < Math.abs(target - ans))
                    ans = sum;
                if (sum < target)
                    start++;
                else if (sum > target)
                    end--;
                else
                    return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[] { -1, 2, 1, -4 }, 1)); // 2
    }
}
