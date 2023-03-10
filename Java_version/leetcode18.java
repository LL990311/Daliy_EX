package Java_version;

import java.util.*;

/**
 * Mar 10 2023
 * Leetcode_18
 * Written by Java
 * Author: LukeLong
 */

/**
 * 给你一个由 n 个整数组成的数组 nums ，和一个目标值 target 。
 * 请你找出并返回满足下述全部条件且不重复的四元组
 *  [nums[a], nums[b], nums[c], nums[d]] （若两个四元组元素一一对应，则认为两个四元组重复）：
 * 0 <= a, b, c, d < n
 * a、b、c 和 d 互不相同
 * nums[a] + nums[b] + nums[c] + nums[d] == target
 * 你可以按 任意顺序 返回答案 。
 * 
 * 双指针
 * 时间 O(n^3)
 * 空间 O(n)
 */

public class leetcode18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 4) return res;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            long fsum = (long)nums[i] + nums[i+1] + nums[i+2] + nums[i+3];
            if (fsum > target) break;
            if (i > 0 && nums[i] == nums[i-1]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                long ssum = (long)nums[i] + nums[j] + nums[j+1] + nums[j+2];
                if (ssum > target) break;
                if (j > i + 1 && nums[j] == nums[j-1]) continue;
                int l = j + 1, r = nums.length - 1;
                while (l < r) {
                    long tsum = (long)nums[i] + nums[j] + nums[l] + nums[r];
                    if (tsum == target){
                        res.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        while(l < r && nums[l] == nums[l+1]) l++;
                        while(l < r && nums[r] == nums[r-1]) r--;
                        l++;
                        r--;
                    }else if (tsum > target) r--;
                    else l++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(fourSum(new int[] {1,0,-1,0,-2,2}, 0));
    }
}
