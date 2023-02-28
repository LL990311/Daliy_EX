package Java_version;

import java.util.*;

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

public class leetcode2363 {
    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] cur : items1) {
            map.put(cur[0], map.getOrDefault(cur[0], 0) + cur[1]);
        }
        for (int[] cur : items2) {
            map.put(cur[0], map.getOrDefault(cur[0], 0) + cur[1]);
        }
        List<List<Integer>> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> cur : map.entrySet()) {
            int k = cur.getKey(), v = cur.getValue();
            List<Integer> temp = new ArrayList<>();
            temp.add(k);
            temp.add(v);
            res.add(temp);
        }
        Collections.sort(res, (a, b) -> a.get(0) - b.get(0));
        return res;
    }

    public static void main(String[] args) {
        int[][] test1 = new int[][] { { 1, 1 }, { 4, 5 }, { 3, 8 } };
        int[][] test2 = new int[][] { { 3, 1 }, { 1, 5 } };
        List<List<Integer>> res = mergeSimilarItems(test1, test2);
        System.out.println(res);
    }
}
