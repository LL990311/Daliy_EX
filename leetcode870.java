/**
 * Oct 8 2022
 * Leetcode_870
 * Written by Java
 */

/**
 * 优势洗牌
 * 给定两个大小相等的数组 nums1 和 nums2，nums1 相对于 nums 的优势可以用满足 nums1[i] > nums2[i] 的索引 i 的数目来描述。
 * 返回 nums1 的任意排列，使其相对于 nums2 的优势最大化。
 * 田忌赛马
 * 时间复杂度: O(nlogn)
 * 空间复杂度: O(n)
 */

import java.util.*;

public class leetcode870 {
    public static int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++)
            idx[i] = i;
        Arrays.sort(nums1);
        Arrays.sort(idx, (i, j) -> nums2[i] - nums2[j]);
        int left = 0, right = n - 1;
        for (int i : nums1) {
            if (i > nums2[idx[left]])
                nums2[idx[left++]] = i;
            else
                nums2[idx[right--]] = i;
        }
        return nums2;
    }

    public static void main(String[] args) {
        int[] test1 = new int[] {12,24,8,32}, test2 = new int[] {13,25,32,11};
        int[] res = advantageCount(test1, test2); //[24,32,8,12]
        for (int i : res) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
