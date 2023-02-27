'''
/**
 * Feb 27 2023
 * Leetcode_1144
 * Written by Python
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
 
 '''

def movesToMakeZigzag(self, nums: list[int]) -> int:
    ans1, ans2, n = 0, 0, len(nums)
    for i in range(len(nums)):
        if i % 2 == 0:
            cur1 = nums[i] - nums[i-1] + \
                1 if i > 0 and nums[i] >= nums[i-1] else 0
            cur2 = nums[i] - nums[i+1] + 1 if i < n - \
                1 and nums[i] >= nums[i+1] else 0
            ans1 += max(cur1, cur2)
        else:
            cur1 = nums[i] - nums[i-1] + 1 if nums[i] >= nums[i-1] else 0
            cur2 = nums[i] - nums[i+1] + 1 if i < n - \
                1 and nums[i] >= nums[i+1] else 0
            ans2 += max(cur1, cur2)
    return min(ans1, ans2)


def main():
    test = [9, 6, 1, 6, 2]
    print(movesToMakeZigzag(any, test))


if __name__ == "__main__":
    main()
