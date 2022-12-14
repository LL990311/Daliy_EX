package Java_version;
/**
 * Sep 21 2022
 * Leetcode_27
 * Written by Java
 */

/**
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * 
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * 
 * 双指针解法
 * 时间复杂度: O(n)
 * 空间复杂度: O(1)
 */

public class leetcode27 {
    public static int removeElement(int[] nums, int val) {
        int j = nums.length - 1;
        for (int i = 0; i <= j; i++) {
            if (nums[i] == val) {
                swap(nums, i--, j--);
            }
        }
        return j + 1;
    }

    static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
        int res = removeElement(nums, 2); // 5 : [0,1,4,0,3]
        System.out.println(res);
    }
}
