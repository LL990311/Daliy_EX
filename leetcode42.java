/**
 * Sep 14 2022
 * Leetcode_42
 * Written by Java
 */


/**
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 * 
 * 双指针解法
 * 时间复杂度: O(n)
 * 空间复杂度: O(1)
 */

class Solution {
    public static int trap(int[] height) {
        int leftmost = 0, rightmost = 0;
        int res = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            leftmost = Math.max(height[left],leftmost);
            rightmost = Math.max(height[right],rightmost);
            if (height[left] < height[right]) {
                res += leftmost - height[left];
                left++;
            }
            else {
                res += rightmost - height[right];
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] test = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int res = trap(test);
        System.out.println(res);
    }
}