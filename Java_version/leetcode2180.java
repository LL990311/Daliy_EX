package Java_version;

/**
 * Jan 6 2023
 * leetcode_2180
 * Written by Java
 */

/*
 * 给你一个正整数 num ，请你统计并返回 小于或等于 num 且各位数字之和为 偶数 的正整数的数目。
 * 正整数的 各位数字之和 是其所有位上的对应数字相加的结果。
 * 
 * 时间 O(n * nlogn)
 */

public class leetcode2180 {
    public static int countEven(int num) {
        int res = 0;
        for (int i = 1; i <= num; i++) {
            int x = i, sum = 0;
            while (x > 0) {
                sum += x % 10;
                x /= 10;
            }
            if (sum % 2 == 0) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countEven(4)); // 2
    }
}
