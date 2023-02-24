'''
/**
 * Feb 24 2023
 * leetcode_2357
 * Written by Java
 */

/**
 * 给你一个非负整数数组 nums 。在一步操作中，你必须：
 * 
 * 选出一个正整数 x ,x 需要小于或等于 nums 中 最小 的 非零 元素。
 * nums 中的每个正整数都减去 x。
 * 返回使 nums 中所有元素都等于 0 需要的 最少 操作数。
 * 
 * 哈希表
 * 时间 O(n)
 * 空间 O(n)
 */

'''

def minimumOperations(self, nums: list[int]) -> int:
        return len(set(nums) - {0})

def main():
    test = [1,5,0,3,5]
    print(minimumOperations(any,test))
if __name__ == "__main__" :
    main()