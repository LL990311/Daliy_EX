
'''
/**
 * Mar 10 2023
 * Leetcode_15
 * Written by Python
 * Author: LukeLong
 */

/**
 * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 
 * 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。
 * 请你返回所有和为 0 且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 * 
 * 双指针
 * 时间 O(n^2)
 * 空间 O(n)
 */
 '''


def threeSum(self, nums: list[int]) -> list[list[int]]:
    res = []
    if len(nums) < 3:
        return res
    nums.sort()
    for i in range(len(nums)):
        if nums[i] > 0:
            break
        if i > 0 and nums[i] == nums[i-1]:
            continue
        l, r = i + 1, len(nums) - 1
        while l < r:
            sum = nums[i] + nums[l] + nums[r]
            if sum == 0:
                res.append([nums[i], nums[l], nums[r]])
                while l < r and nums[l] == nums[l+1]:
                    l += 1
                while l < r and nums[r] == nums[r-1]:
                    r -= 1
                l += 1
                r -= 1
            elif sum > 0:
                r -= 1
            else:
                l += 1
    return res


def main():
    print(threeSum(any, [-1, 0, 1, 2, -1, -4]))


if __name__ == "__main__":
    main()
