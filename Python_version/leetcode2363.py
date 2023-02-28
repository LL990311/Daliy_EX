from collections import Counter

'''
/**
 * Feb 28 2023
 * Leetcode_2363
 * Written by Java
 */

/**
 * 给你两个二维整数数组 items1 和 items2 ，表示两个物品集合。每个数组 items 有以下特质：
 * 
 * items[i] = [valuei, weighti] 其中 valuei 表示第 i 件物品的 价值 ，weighti 表示第 i 件物品的 重量 。
 * items 中每件物品的价值都是 唯一的 。
 * 请你返回一个二维数组 ret，其中 ret[i] = [valuei,
 * weighti]， weighti 是所有价值为 valuei 物品的 重量之和 。
 * 
 * 注意：ret 应该按价值 升序 排序后返回。
 * 
 * 哈希表
 * 时间复杂度: O(n)
 * 空间复杂度: O(n)
 */
'''


def mergeSimilarItems(self, items1: list[list[int]], items2: list[list[int]]) -> list[list[int]]:
    map = Counter()
    for a, b in items1:
        map[a] += b
    for a, b in items2:
        map[a] += b
    return sorted([a, b] for a, b in map.items())


def main():
    print(mergeSimilarItems(any, [[1, 1], [4, 5], [3, 8]], [[3, 1], [1, 5]]))


if __name__ == "__main__":
    main()
