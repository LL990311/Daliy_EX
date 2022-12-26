package Java_version;

/**
 * Dec 26 2022
 * Leetcode_1759
 * Written by Java
 */

/**
 * 
 * 给你一个字符串 s ，返回 s 中 同构子字符串 的数目。由于答案可能很大，只需返回对 109 + 7 取余 后的结果。
 * 同构字符串 的定义为：如果一个字符串中的所有字符都相同，那么该字符串就是同构字符串。
 * 子字符串 是字符串中的一个连续字符序列
 * 
 * 数学
 * 时间复杂度: O(n)
 * 空间复杂度: O(1)
 */

public class leetcode1759 {
    public static int countHomogenous(String s) {
        final int MOD = 1000000007;
        char prev = s.charAt(0);
        int count = 0;
        long res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == prev) {
                count++;
            }else {
                res += (long) count * (count+1) / 2;
                count = 1;
                prev = c;
            }
        }
        res += (long) count * (count + 1) / 2;
        return (int) (res % MOD);
        
    }

    public static void main(String[] args) {
        System.out.println(countHomogenous("abbcccaa")); //13
    }
}
