package Java_version;

import java.util.*;

/**
 * Jan 10 2023
 * Leetcode_753
 * Written by Java
 */

/**
 * 
 * 有一个需要密码才能打开的保险箱。密码是 n 位数, 密码的每一位是 k 位序列 0, 1, ..., k-1 中的一个 。
 * 
 * 你可以随意输入密码，保险箱会自动记住最后 n 位输入，如果匹配，则能够打开保险箱。
 * 
 * 举个例子，假设密码是 "345"，你可以输入 "012345" 来打开它，只是你输入了 6 个字符.
 * 
 * 请返回一个能打开保险箱的最短字符串
 * 
 */

public class leetcode753 {
    static StringBuilder sb = new StringBuilder();
    static Set<Integer> set = new HashSet<>();
    static int K, MOD;

    public static String crackSafe(int n, int k) {
        MOD = (int) Math.pow(10, n - 1);
        K = k;
        dfs(0);
        for (int i = 1; i < n; i++) {
            sb.append("0");
        }
        return sb.toString();
    }

    static void dfs(int s) {
        for (int i = 0; i < K; ++i) {
            int cur = i + s * 10;
            if (!set.contains(cur)) {
                set.add(cur);
                dfs(cur % MOD);
                sb.append(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(crackSafe(2, 2));
        /*
         * 00110, 01100, 10011, 11001
         */
    }
}
