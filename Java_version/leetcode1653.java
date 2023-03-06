package Java_version;

/**
 * Mar 06 2023
 * Leetcode_1653
 * Written by Java
 */

/**
 * 给你一个字符串 s ，它仅包含字符 'a' 和 'b'​​​​ 。
 * 
 * 你可以删除 s 中任意数目的字符，使得 s 平衡 。当不存在下标对 (i,j) 满足 i < j ，且 s[i] = 'b' 的同时 s[j]= 'a'
 * ，此时认为 s 是 平衡 的。
 * 
 * 请你返回使 s 平衡 的 最少 删除次数。
 * 
 * 模拟
 * 时间复杂度: O(n)
 * 空间复杂度: O(1)
 */

public class leetcode1653 {
    public static int minimumDeletions(String s) {
        int res = 0, resA = 0, resB = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                resA++;
        }
        res = resA;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                resA--;
            else
                resB++;
            res = Math.min(res, resA + resB);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(minimumDeletions("aababbab")); // 2
    }
}
