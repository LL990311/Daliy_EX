'''
/**
 * Mar 10 2023
 * Leetcode_18
 * Written by Python
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
'''

def fourSum(self, nums: list[int], target: int) -> list[list[int]]:
    res = []
    if len(nums) < 4:
        return res
    nums.sort()
    for i in range(len(nums) - 3):
        fsum = nums[i] + nums[i+1] + nums[i+2] + nums[i+3]
        if fsum > target:
            break
        if (i > 0 and nums[i] == nums[i-1]):
            continue
        for j in range(i + 1, len(nums) - 2):
            ssum = nums[i] + nums[j] + nums[j+1] + nums[j+2]
            if ssum > target:
                break
            if j > i + 1 and nums[j] == nums[j-1]:
                continue
            l, r = j + 1, len(nums) - 1
            while l < r:
                tsum = nums[i] + nums[j] + nums[l] + nums[r]
                if tsum == target:
                    res.append([nums[i], nums[j], nums[l], nums[r]])
                    while (l < r and nums[l] == nums[l+1]):
                        l += 1
                    while (l < r and nums[r] == nums[r-1]):
                        r -= 1
                    l += 1
                    r -= 1
                elif tsum > target:
                    r -= 1
                else:
                    l += 1
    return res

def main():
    print(fourSum(any, [1,0,-1,0,-2,2],0))

if __name__ == "__main__":
    main()
