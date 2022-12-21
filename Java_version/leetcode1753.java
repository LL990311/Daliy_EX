package Java_version;

/**
 * Dec 21 2022
 * Leetcode_1753
 * Written by Java
 */

/**
 * 
 * 你正在玩一个游戏，面前放置着大小分别为a, b ,c 三堆石子。
 * 每回合你都要从两个不同的非空堆中取出一颗石子，并在得分上加1分。当存在两个或更多的空堆时，游戏停止。
 * 
 * 暴力
 * 时间复杂度: O(1)
 * 空间复杂度: O(1)
 */

public class leetcode1753 {
    public static int maximumScore(int a, int b, int c) {
        int sum = a + b + c;
        int maxVal = Math.max(Math.max(a,b),c);
        return Math.min(sum - maxVal, sum/2);
    }

    public static void main(String[] args) {
        System.out.println(maximumScore(4, 4, 6)); // 7
    }
}
