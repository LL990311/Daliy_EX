package Java_version;

/**
 * Dec 09 2022
 * Leetcode_1806
 * Written by Java
 */

/*
 * 给你一个偶数 n​​​​​​ ，已知存在一个长度为 n 的排列 perm ，其中 perm[i] == i​（下标 从 0 开始 计数）。
 * 一步操作中，你将创建一个新数组 arr ，对于每个 i ：
 * 如果 i % 2 == 0 ，那么 arr[i] = perm[i / 2]
 * 如果 i % 2 == 1 ，那么 arr[i] = perm[n / 2 + (i - 1) / 2]
 * 然后将 arr​​ 赋值​​给 perm 。
 * 
 * 要想使 perm 回到排列初始值，至少需要执行多少步操作？返回最小的 非零 操作步数。
 */

public class leetcode1806 {
    public static int reinitializePermutation(int n) {
        int i = 1, step = 1;
        while (true) {
            i = i % 2 == 0 ? i / 2 : (n - 1 + i) / 2;
            if (i == 1) return step;
            step++;
        }
    }

    public static void main(String[] args) {
        System.out.println(reinitializePermutation(4)); //2
    }
}
