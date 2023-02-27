package Java_version;

/**
 * Feb 27 2023
 * Leetcode_1144
 * Written by Java
 */

/**
 * 给你一个整数数组 nums，每次 操作 会从中选择一个元素并 将该元素的值减少 1。
 * 
 * 如果符合下列情况之一，则数组 A 就是 锯齿数组：
 * 
 * 每个偶数索引对应的元素都大于相邻的元素，即 A[0] > A[1] < A[2] > A[3] < A[4] > ...
 * 或者，每个奇数索引对应的元素都大于相邻的元素，即 A[0] < A[1] > A[2] < A[3] > A[4] < ...
 * 返回将数组 nums 转换为锯齿数组所需的最小操作次数。
 * 
 * 模拟
 * 时间 O(n)
 * 空间 O(1)
 */

public class leetcode1144 {
    public static int movesToMakeZigzag(int[] nums) {
        int ans1 = 0, ans2 = 0, cur1 = 0, cur2 = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (i > 0 && nums[i] >= nums[i - 1])
                    cur1 = nums[i] - nums[i - 1] + 1;
                else
                    cur1 = 0;
                if (i < n - 1 && nums[i] >= nums[i + 1])
                    cur2 = nums[i] - nums[i + 1] + 1;
                else
                    cur2 = 0;
                ans1 += Math.max(cur1, cur2);
            } else {
                if (nums[i] >= nums[i - 1])
                    cur1 = nums[i] - nums[i - 1] + 1;
                else
                    cur1 = 0;
                if (i < n - 1 && nums[i] >= nums[i + 1])
                    cur2 = nums[i] - nums[i + 1] + 1;
                else
                    cur2 = 0;
                ans2 += Math.max(cur1, cur2);
            }
        }
        return Math.min(ans1, ans2);
    }

    public static void main(String[] args) {
        System.out.println(movesToMakeZigzag(new int[] { 10, 4, 4, 10, 10, 6, 2, 3 })); // 13
    }
}
