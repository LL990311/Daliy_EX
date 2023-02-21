package Java_version;

/**
 * Feb 21 2022
 * Leetcode_1326
 * Written by Java
 */

/**
 * 在 x 轴上有一个一维的花园。花园长度为 n，从点 0 开始，到点 n 结束。
 * 
 * 花园里总共有 n + 1 个水龙头，分别位于 [0, 1, ..., n] 。
 * 
 * 给你一个整数 n 和一个长度为 n + 1 的整数数组 ranges ，其中 ranges[i] （下标从 0
 * 开始）表示：如果打开点 i 处的水龙头，可以灌溉的区域为 [i -  ranges[i], i + ranges[i]] 。
 * 
 * 请你返回可以灌溉整个花园的 最少水龙头数目 。如果花园始终存在无法灌溉到的地方，请你返回 -1 。
 * 
 * 贪心
 * 时间 O(n)
 * 空间 O(n)
 */

public class leetcode1326 {
    public static int minTaps(int n, int[] ranges) {
        int[] rightMost = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            rightMost[i] = i;
        }
        for (int i = 0; i <= n; i++) {
            int start = Math.max(0, i - ranges[i]);
            int end = Math.min(n, i + ranges[i]);
            rightMost[start] = Math.max(rightMost[start], end);
        }
        int last = 0, ret = 0, pre = 0;
        for (int i = 0; i < n; i++) {
            last = Math.max(last, rightMost[i]);
            if (i == last) {
                return -1;
            }
            if (i == pre) {
                ret++;
                pre = last;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(minTaps(5, new int[] { 3, 4, 1, 1, 0, 0 })); // 1
    }
}
