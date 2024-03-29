package Java_version;

/**
 * Mar 15 2023
 * Leetcode_1615
 * Written by Java
 * Author: LukeLong
 */

/*
 * n 座城市和一些连接这些城市的道路 roads 共同组成一个基础设施网络。每个 roads[i] = [ai, bi] 都表示在城市 ai 和 bi
 * 之间有一条双向道路。
 * 
 * 两座不同城市构成的 城市对 的 网络秩 定义为：与这两座城市 直接 相连的道路总数。如果存在一条道路直接连接这两座城市，则这条道路只计算 一次 。
 * 
 * 整个基础设施网络的 最大网络秩 是所有不同城市对中的 最大网络秩 。
 * 
 * 给你整数 n 和数组 roads，返回整个基础设施网络的 最大网络秩 。
 * 
 * 枚举 + 计数
 * 时间复杂度: O(n^2)
 * 空间复杂度: O(n)
 */

public class leetcode1615 {
    public static int maximalNetworkRank(int n, int[][] roads) {
        int[][] connect = new int[n][n];
        int[] count = new int[n];
        for (int[] cur : roads) {
            int i = cur[0], j = cur[1];
            connect[i][j] = 1;
            connect[j][i] = 1;
            count[i]++;
            count[j]++;
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                res = Math.max(res, count[i] + count[j] - connect[i][j]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maximalNetworkRank(4, new int[][] { { 0, 1 }, { 0, 3 }, { 1, 2 }, { 1, 3 } }));
    }
}
