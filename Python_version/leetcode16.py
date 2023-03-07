'''
Mar 07 2023
Leetcode_16
Written by Python
Author @LukeLong

给你一个长度为 n 的整数数组 nums 和 一个目标值 target。
请你从 nums 中选出三个整数，使它们的和与 target 最接近。

返回这三个数的和。

假定每组输入只存在恰好一个解。

双指针解法
时间 O(n^2)
空间 O(1)

'''


def threeSumClosest(self, nums: list[int], target: int) -> int:
    nums.sort()
    ans = nums[0] + nums[1] + nums[2]
    for i, _ in enumerate(nums):
        start = i + 1
        end = len(nums) - 1
        while start < end:
            s = nums[i] + nums[start] + nums[end]
            if (abs(target - s) < abs(target - ans)):
                ans = s
            if (s < target):
                start += 1
            elif (s > target):
                end -= 1
            else:
                return ans
    return ans


def main():
    print(threeSumClosest(any, [-1, 2, 1, -4], 1))


if __name__ == "__main__":
    main()
