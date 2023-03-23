package Java_version;

import java.util.*;

/**
 * Mar 23 2023
 * Leetcode1630
 * Written By Java
 * Author: ll
 */

/**
 * 
 * 如果一个数列由至少两个元素组成，且每两个连续元素之间的差值都相同，
 * 那么这个序列就是 等差数列 。更正式地，数列 s 是等差数列，只需要满足：
 * 对于每个有效的 i ， s[i+1] - s[i] == s[1] - s[0] 都成立。
 * 
 * 给你一个由 n 个整数组成的数组 nums，和两个由 m 个整数组成的数组 l 和 r，后两个数组表示 m 组范围查询，其中第 i 个查询对应范围
 * [l[i], r[i]] 。所有数组的下标都是 从 0 开始 的。
 * 
 * 返回 boolean 元素构成的答案列表 answer 。如果子数组 nums[l[i]], nums[l[i]+1], ... , nums[r[i]]
 * 可以 重新排列 形成 等差数列 ，answer[i] 的值就是 true；否则answer[i] 的值就是 false 。
 * 
 * 时间 O(nm)
 * 空间 O(n)
 */

public class leetcode1630 {
    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            res.add(check(Arrays.copyOfRange(nums, l[i], r[i] + 1)));
        }
        return res;
    }

    static boolean check(int[] arr) {
        if (arr.length < 2) {
            return false;
        }
        if (arr.length == 2) {
            return true;
        }
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (diff != arr[i] - arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Boolean> res = (checkArithmeticSubarrays(new int[] { 4, 6, 5, 9, 3, 7 },
                new int[] { 0, 0, 2 }, new int[] { 2, 3, 5 }));
        for (Boolean b : res) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
}
