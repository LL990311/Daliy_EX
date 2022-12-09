package Java_version;

/**
 * Dec 9 2022
 * Leetcode_1780
 * Written by Java
 */

/**
 * 给你一个整数 n ，如果你可以将 n 表示成若干个不同的三的幂之和，请你返回 true ，否则请返回 false 。
 * 
 * 对于一个整数 y ，如果存在整数 x 满足 y == 3x ，我们称这个整数 y 是三的幂。
 * 
 * 模拟
 * 时间复杂度: O(n)
 * 空间复杂度: O(n)
 */

public class leetcode1780 {
    public static boolean checkPowersOfThree(int n) {
        while (n != 0) {
            if (n % 3 == 2) {
                return false;
            }
            n /= 3;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPowersOfThree(12));
        System.out.println(checkPowersOfThree(21));
    }
}