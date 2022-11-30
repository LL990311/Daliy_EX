package Java_version;

/**
 * Nov 15 2022
 * Leetcode_1710
 * Written by Java
 */

/**
 * 卡车上的最大单元数
 * 
 * 请你将一些箱子装在 一辆卡车 上。给你一个二维数组 boxTypes ，其中 boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi] ：
 * numberOfBoxesi 是类型 i 的箱子的数量。
 * numberOfUnitsPerBoxi 是类型 i 每个箱子可以装载的单元数量。
 * 整数 truckSize 表示卡车上可以装载 箱子 的 最大数量 。只要箱子数量不超过 truckSize ，你就可以选择任意箱子装到卡车上。
 * 返回卡车可以装载 单元 的 最大 总数。
 * 
 * 模拟
 * 时间复杂度: O(n)
 * 空间复杂度: O(n)
 */

import java.util.*;

public class leetcode1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int n = boxTypes.length, res = 0;
        for (int i = 0, cnt = 0; i < n && cnt < truckSize; i++) {
            int a = boxTypes[i][0], b = boxTypes[i][1], c = Math.min(a, truckSize - cnt);
            cnt += c;
            res += c * b;
        }
        return res;
    }
}
